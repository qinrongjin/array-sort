package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

public class HeapSort implements Sortor {

	@Override
	public int[] sort(int[] arr) {
		initHeap(arr);
		display(arr);
		heapSort(arr, arr.length);
		return arr;
	}
	
	/**
	 * 进行堆排序
	 * @param arr
	 * @param length
	 */
	private void heapSort(int[] arr, int heapSize) {
		while(heapSize > 1) {
			heapSize --;
			int temp = arr[heapSize];
			arr[heapSize] = arr[0];
			arr[0] = temp;
			maxIfy(arr, 0, heapSize);
		}
	}

	/**
	 * 初始化堆
	 * @param arr
	 */
	private void initHeap(int[] arr) {
		int head = arr.length / 2 - 1;
		while(head >=0) {
			maxIfy(arr, head, arr.length);
			head --;
		}
	}

	/**
	 * 构建i为头的堆
	 * @param arr
	 * @param head
	 */
	private void maxIfy(int[] arr, int head, int heapSize) {
		int lc = 2*head;
		int rc = 2*head + 1;
		int maxC = -1;
		if(lc >= heapSize && rc >= heapSize) return;
		else {
			if(lc >= heapSize && rc < heapSize) maxC = rc;
			if(lc < heapSize && rc >= heapSize) maxC = lc;
			if(lc < heapSize && rc < heapSize) maxC = arr[lc] > arr[rc] ? lc: rc;
			if(maxC!=-1 && arr[maxC] > arr[head]) {
				int temp = arr[maxC];
				arr[maxC] = arr[head];
				arr[head] = temp;
				maxIfy(arr, maxC, heapSize);
			}
		}
	}

	@Override
	public String getSortName() {
		return "堆排序";
	}

}
