package org.tyss.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add(23);
		set.add(3);
		set.add("jshd");
		set.add(true);
		set.add(true);
		set.add(null);
		set.add(null);
		System.out.println(set);
//		ArrayList arr=new ArrayList();
//		arr.add("hi i am ArrayList");
//		System.out.println(set.addAll(arr));
//		System.out.println(set.contains(93));
//		Object[] o=set.toArray();
//		for(Object ob:o) {
//		System.out.println(ob);
		}
	}

