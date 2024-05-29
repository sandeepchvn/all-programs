package org.tyss.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateElement {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(2);
		ar.add(5);
		ar.add(1);
		ar.add(78);
		ar.add(4);
		Iterator iterator=ar.listIterator();
		// iterating in forword direction
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		ListIterator li=ar.listIterator();
//		
//		System.out.println("--------------------------------");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
		while(li.hasNext()) {
			if((Integer)li.next() > 5) {
				li.remove();
			}
			//System.out.println(li.next());
		}
		for (int i1=0; i1<ar.size();i1++) {
			System.out.println(ar.get(i1));
		}
		//System.out.println(ar);
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
	}
}
