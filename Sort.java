package com;

public class Sort {
	
	public static void bubbleSort(int[] array) {
        int temp;//定义一个临时变量
        for(int i=0;i<array.length-1;i++){//冒泡趟数
        	
            for(int j=0;j<array.length-i-1;j++){
            	
                if(array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
	public static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			binarySort(array, i);
		}
	}
	
	public static void binarySort(int[] array, int index) {
		int left = 0;
		int right = index - 1;
		int value = array[index];
		while (left <= right) {
			int middle = (left + right) / 2;
			if (array[middle] < value) {
				left = middle + 1;
			} else {
				right = middle -1;
			}
		}
		for (int i = index; i > left; i--) {
			array[i] = array[i-1];
		}
		array[left] = value;
	}
}
