package org.tyss.Hashset;

import java.util.Comparator;

public class SortItemById implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {
		if (o1.getItemId() > o2.getItemId())
			return 1;
		else if (o1.getItemId() < o2.getItemId())
			return -1;
		return 0;
	}
}
