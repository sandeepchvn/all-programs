package org.tyss.collections;

public class Pen implements Comparable<Pen> 
{
	public int price;
	public String color;

	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "price:" + price + " color:" + color;
	}
	@Override
	public boolean equals(Object obj) {
		Pen p=  (Pen)obj;
		return this.color==p.color &&  this.price==p.price;
	}
	// explicitly we have to sort Pen according to price 
//	@Override
//	public int compareTo(Pen p) {
//		if(this.price > p.price)
//			return +3;
//		if(this.price < p.price)
//			return -83;
//		return 0;
//	}
//below one is to sort both price and color of the  pen
	@Override
	public int compareTo(Pen p) {
		int res=0;
		if(this.price > p.price)
			 res=+3;
		if(this.price < p.price)
			res=-83;
		if(this.price==p.price)
			res=this.color.compareTo(p.color);
		return res;
	}
}
