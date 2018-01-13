package com.tiny77.sort.impl;

import com.tiny77.sort.itf.Sortor;

/**
 * 希尔排序
 * @author mrqin
 *选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 *按增量序列个数k，对序列进行k 趟排序；
 *每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 *伪代码
 *
   input: an array a of length n with array elements numbered 0 to n − 1
　　inc ← round(n/2)
　　while inc > 0 do: 
　　for i = inc .. n − 1 do: 
　　temp ← a[i] 
　　j ← i 
　　while j ≥ inc and a[j − inc] > temp do: 
　　a[j] ← a[j − inc] 
　　j ← j − inc 
　　a[j] ← temp 
　　inc ← round(inc / 2.2)
 */
public class ShellSort implements Sortor {

	@Override
	public int[] sort(int[] arr) {
		int d = arr.length;
		while(d > 0) {
			d /= 2;
			for(int x = 0; x < d; x ++) {
				for(int i = x + d; i < arr.length; i += d) {
					int temp = arr[i];
					int j = i - d;
					while (j >= x && arr[j] > temp) {
						arr[j + d] = arr[j];
						j -= d;
					}
					arr[j+d] = temp;
				}
			}
		}
		return arr;
	}

	@Override
	public String getSortName() {
		return "希尔排序";
	}

}
