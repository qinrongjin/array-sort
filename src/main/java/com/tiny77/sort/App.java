package com.tiny77.sort;

import com.tiny77.sort.impl.*;
import com.tiny77.sort.itf.Sortor;
import com.tiny77.sort.util.SortorFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Sortor sortor = SortorFactory.getSortor(BubbleSort.class);
		int[] arr = sortor.randomArr();
		sortor.display(arr);
		arr = sortor.sort(arr);
		sortor.display(arr);
	}
}
