package org.tyss.treeset;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Pen> set = new TreeSet<>();
		set.add(new Pen(23, "pink"));
		set.add(new Pen(53, "red"));
		set.add(new Pen(13, "red"));
		set.add(new Pen(13, "red"));
		set.add(new Pen(43, "white"));
		Pen p=new Pen();
		p.color="white";
		p.price=43;
		set.add(p);
		System.out.println(set.size());
		System.out.println(set);
		for (Pen p1 : set)
			System.out.println(p1);
	}
}