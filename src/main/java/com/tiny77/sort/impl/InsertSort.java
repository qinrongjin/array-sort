package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

public class InsertSort implements Sortor {


	@Override
	public String getSortName() {
		return "插入排序";
	}
	
	/**
	 * 1）将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
	 * 2）从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
	 */
	
	@Override
	public int[] sort(int[] arr) {
		for(int i = 1; i< arr.length; i++) {
			int num = arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > num ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = num;
		}
		return arr;
	}


}
