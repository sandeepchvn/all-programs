package org.tyss.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.tyss.collections.Pen;

public class SortPenByPrice {
	public static void main(String[] args) {
		ArrayList<Pen> arr=new ArrayList<Pen>();
		arr.add(new Pen(50, "red"));
		arr.add(new Pen(10, "black"));
		arr.add(new Pen(30, "white"));
		arr.add(new Pen(20, "pink"));
		arr.add(new Pen(10, "yellow"));
		System.out.println("before sortin"+arr);
		Collections.sort(arr,new SortBothPriceAndColor());
// below sorting is lambda expression sorting
//		Comparator<Pen> con=(p1,p2)->p1.price>p2.price?1:-1;
//		Collections.sort(arr,con);
		System.out.println("after sorting"+arr);
	}
}
