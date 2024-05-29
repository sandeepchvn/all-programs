package org.tyss.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset2 {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>(new Comp());
		t1.add(53);
		t1.add(6);
		t1.add(88);
		t1.add(33);
		t1.add(35);
		t1.add(9);
		System.out.println(t1);
	SortedSet<Integer>	s=t1.subSet(35, 8);
		System.out.println(s);
	}
}
class Comp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
