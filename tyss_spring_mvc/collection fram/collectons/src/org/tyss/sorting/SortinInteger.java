package org.tyss.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortinInteger {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(43);
	list.add(3);
	list.add(4);
	list.add(13);
	list.add(32);
	System.out.println("before sorting"+list);
	Collections.sort(list);
	System.out.println("after sorting"+list);
	//note in Integer compareTo() is already overridden to sort the Integer
}
}
