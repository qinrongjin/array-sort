package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

public class MergeSort implements Sortor{

	@Override
	public int[] sort(int[] arr) {
		int me = arr.length/2;
		int[] res = new int[arr.length];
		mergeSort(arr,res , 0, me, arr.length); // 合并结果到res数组中
		return res;
	}

	/**
	 * 归并排序数组
	 * 先合并比较小的两个子数组
	 * @param arr
	 * @param res
	 * @param start
	 * @param me
	 * @param end
	 * 结果放到res中
	 */
	private void mergeSort(int[] arr, int[] res, int start, int me, int end) {
		if(start < me - 1) {
			int me1 = (start + me) / 2;
			mergeSort(arr, res, start, me1, me);
		}
		if(me < end - 1) {
			int me2 = (me + end) / 2;
			mergeSort(arr, res, me, me2, end);
		}
		merge(arr, res, start, me, end);
		copyArr(res, arr, start, end);
	}
	private void copyArr(int[] res, int[] arr, int start, int end) {
		for (int i = start; i < end; i++) {
			arr[i] = res[i];
		}
	}

	/**
	 * 合并两个数组到目标数组
	 * 原数组  start 至 me-1  和   me 至 end-1 合并
	 * @param arr
	 * @param i
	 * @param me
	 * @param length
	 * 结果放到res中
	 */
	private void merge(int[] arr, int[] res, int start, int me, int end) {
		int i1 = start;
		int i2 = me;
		int ires = start;
		while(i1 < me && i2 < end) {
			if(arr[i1] <= arr[i2]) {
				res[ires++] = arr[i1++];
			}else {
				res[ires++] = arr[i2++];
			}
		}
		while(i1 < me) {
			res[ires++] = arr[i1++];
		}
		while(i2 < end) {
			res[ires++] = arr[i2++];
		}
	}

	@Override
	public String getSortName() {
		return "归并排序";
	}
	
	public static void main(String []args) {
		MergeSort sort = new MergeSort();
		int[] arr = {2,3,4,1,5,7};
		sort.display(arr);
		int[] res = new int[arr.length];
		sort.merge(arr, res, 0, arr.length/2, arr.length);
		sort.display(res);
	}

}
