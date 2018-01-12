package com.tiny77.sort;

import com.tiny77.sort.impl.InsertSort;
import com.tiny77.sort.itf.Sortor;
import com.tiny77.sort.util.SortorFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Sortor sortor = SortorFactory.getSortor(InsertSort.class);
		int[] arr = sortor.randomArr(1000);
		sortor.display(arr);
		arr = sortor.sort(arr);
		sortor.display(arr);
	}
}
