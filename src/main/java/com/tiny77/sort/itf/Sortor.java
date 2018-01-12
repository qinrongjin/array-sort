package com.tiny77.sort.itf;

/**
 * 排序接口
 * @author qinrongjin
 *
 */
public interface Sortor {

	/**
	 * 排序数组
	 * @param arr
	 * @return
	 */
	int[] sort(int []arr);
	
	/**
	 * 排序名称
	 * @return
	 */
	String getSortName();
	
	/**
	 * 打印数组 [a1,a2,a3 ... an]
	 * @param arr
	 */
	default void display(int []arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	};
	
	/**
	 * 随机数组
	 * @return
	 */
	default int[] randomArr() {
		return randomArr(10);
	}
	
	/**
	 * 随机数组
	 * @param n 长度
	 * @return
	 */
	public default int[] randomArr(int n) {
		return randomArr(n, 0, 5*n);
	}
	
	/**
	 * 随机数组
	 * @param n 长度
	 * @param min 随机数最小值
	 * @param max 随机数最大值
	 * @return
	 */
	public default int[] randomArr(int n, int min, int max) {
		int[] arr = new int[n];
		int x = max - min;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*x) + min;
		}
		return arr;
	}
	
}
