package org.tyss.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PenArrayList {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(new Pen(12, "red"));
	ar.add(new Pen(20, "white"));
	ar.add(new Pen(53, "black"));
	ar.add(new Pen(10, "yellow"));
//	Pen p=new Pen(100,"pink");
//	ar.add(p);
	//System.out.println(ar);
	//ar.remove(new Pen(12, "red")); it will not remove if u r not overrided equals()
	
	//ar.remove(new Pen(12, "red"));
	//System.out.println(ar);
	//Iterator i=ar.iterator();
//	while(i.hasNext()) {
//		if(((Pen)i.next()).price>20)
//			i.remove();
//	}
//	for (int i1=0; i1<ar.size();i1++) {
//		System.out.println(((Pen)ar.get(i1)).price);
//	}
	ListIterator li=ar.listIterator(4);
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
		
	
}
}
