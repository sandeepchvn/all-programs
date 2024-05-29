package org.tyss.sorting;

import java.util.Comparator;

import org.tyss.collections.Pen;

public class SortBothPriceAndColor implements Comparator<Pen> {
	@Override
	public int compare(Pen o1, Pen o2) {
		int res=0;
		if(o1.price>o2.price)
			res=2;
		if(o1.price<o2.price)
			res=-3;
		if(o1.price==o2.price)
			res=o1.color.compareTo(o2.color);
		return res;
	}
}
