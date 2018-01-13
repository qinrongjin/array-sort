package com.tiny77.sort;

import com.tiny77.sort.impl.InsertSort;
import com.tiny77.sort.impl.ShellSort;
import com.tiny77.sort.itf.Sortor;
import com.tiny77.sort.util.SortorFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Sortor sortor = SortorFactory.getSortor(ShellSort.class);
		int[] arr = sortor.randomArr(50000);
		sortor.display(arr);
		arr = sortor.sort(arr);
		sortor.display(arr);
	}
}
