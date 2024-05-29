package org.tyss.treeset;


public class Pen implements Comparable<Pen> {
	String color;
	double price;

	Pen() {

	}

	Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public int hashCode() {
		int hc=0;
		hc=Double.valueOf(this.price).hashCode();
		hc=hc+this.color.hashCode();
		return hc;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Pen p=(Pen)obj;
//		if(this.price>p.price)
//			return 1;
//		if(this.price<p.price)
//		
//		
//		
//		return  ;
//	}

	@Override
	public int compareTo(Pen p) {
		if (this.hashCode() > p.hashCode())
			return 1;
		if (this.hashCode() < p.hashCode())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "("+price + " , " + color+")";
	}

}
