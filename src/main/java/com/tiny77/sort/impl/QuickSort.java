package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

/**
 * 快速排序
 * @author mrqin
 * 
 */
public class QuickSort implements Sortor {

	@Override
	public int[] sort(int[] arr) {
		quickSort(arr, 0, arr.length);
		return arr;
	}
	
	/**
	 * 快速排序
	 * @param arr 数组
	 * @param start 开始下标
	 * @param end 结束下标 + 1
	 */
	private void quickSort(int[] arr, int start, int end) {
		int partPos = partion(arr, start, end); // 划分
		if(start < partPos - 1)
			quickSort(arr, start, partPos);
		if(partPos + 1 < end -2)
			quickSort(arr, partPos + 1, end);
	}



	private int partion(int[] arr, int start, int end) {
		int left = start;
		int right = end - 1;
		while(left < right) {
			while (left < right &&arr[right] > arr[left] ) right --;
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			while(left < right &&arr[right] >= arr[left]) left ++;
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return left;
	}

	@Override
	public String getSortName() {
		return "快速排序";
	}

}
