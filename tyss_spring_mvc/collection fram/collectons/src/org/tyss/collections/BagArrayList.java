package org.tyss.collections;

import java.util.ArrayList;

public class BagArrayList {
	public static void main(String[] args) {
		ArrayList bag= new ArrayList();
		bag.add("american tourist");
		bag.add("hp bag");
		System.out.println(bag);
		bag.add(0,"LN");
		System.out.println(bag);
		
		ArrayList bag2=new ArrayList();
//		bag2.add("b-cool");
//		bag2.add("zakkas bag");
		
		bag.addAll(bag2);
		System.out.println(bag);
		//System.out.println(bag.size());
		bag.removeAll(bag2);
		//bag.remove("hp bag");
		//bag.remove(2);
		bag.set(1, "new HP");// it will replace the element present in that index
		System.out.println(bag.size());
		System.out.println(bag);
	}
}
