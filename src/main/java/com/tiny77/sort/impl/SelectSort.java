package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

/**
 * 选择排序
 * @author mrqin
 *
 */
public class SelectSort implements Sortor {

	@Override
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int minPos = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minPos])
					minPos = j;
			}
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		return arr;
	}

	@Override
	public String getSortName() {
		return "选择排序";
	}

}
