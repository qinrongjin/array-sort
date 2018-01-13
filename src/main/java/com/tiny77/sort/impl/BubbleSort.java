package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

public class BubbleSort implements Sortor{

	@Override
	public int[] sort(int[] arr) {
		for (int i = arr.length ;i > 0 ; i--) {
			for (int j = 0; j < i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	@Override
	public String getSortName() {
		return "冒泡排序";
	}

}
