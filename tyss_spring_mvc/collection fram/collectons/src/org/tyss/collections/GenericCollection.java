package org.tyss.collections;

import java.util.ArrayList;

public class GenericCollection {
public static void main(String[] args) {
	//generic collection
	//to avoid typecasting
	//type safty
	ArrayList<Pen> arr=new ArrayList<Pen>();
	Pen p =new Pen(20,"red");
	arr.add(p);
	arr.add(new Pen(30,"blue"));
	arr.add(new Pen(90,"black"));
	arr.add(new Pen(10,"pink"));
	arr.add(new Pen(50,"red"));
	arr.add(new Pen(20,"yellow"));
	
	int sum=0;
	for (Pen pen : arr) {
		sum+=pen.price;
	}
	System.out.println(sum);
}
}
