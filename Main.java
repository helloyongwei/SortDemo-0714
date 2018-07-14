package com;

import java.io.IOException;
import java.io.InputStream;

import com.Sort;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int count = inputNumber();
			int[] array = createArray(count);
			
			System.out.println("Before:");
			showArray(array);
			
			long start = System.currentTimeMillis();
			Sort.insertSort(array);
//			Sort.bubbleSort(array);
			long end = System.currentTimeMillis();
			
			System.out.println("After:");
			showArray(array);
			
			System.out.println("Time:" + (end-start));
			
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static int inputNumber() throws IOException {
		int value = 0;
		InputStream is = System.in;
		System.out.println("Wait for ...");
		int ch;
		while ((ch = is.read()) != 13) {
			int digit = ch-48;
			if (ch >= 48 && ch <= 57) {
				value = value*10 + digit;
			}
		}
		return value;
	}

	/**
	 * @param count
	 * @return
	 */
	public static int[] createArray(int count) {
		int[] array = new int[count];
		
		for (int i = 0; i < count; i++) {
			array[i] = (int)(Math.random() * 20000);
		}
		
		return array; 
	}
	
	/**
	 * @param array
	 */
	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i%20 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}

}
