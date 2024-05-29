package org.tyss.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.Locale.Category;

public class ItemController {
	private Set<Item> cartItems = new HashSet<Item>();
	public void addItem(Item item) {
		cartItems.add(item);
	}

	public void removeItem(Item item) {
		if (cartItems.remove(item)) {
			System.out.println("Item is removed From the Cart");
		} else
			System.out.println("Item you given for removing is not there");
	}

	public void searcItem(Item item) {
		if (cartItems.contains(item)) {
			System.out.println("Item is present");
		} else {
			System.out.println("Item is not present");
		}
	}

	public void calculateTotalPrice() {
		double totalPrice = 0;
		for (Item item : cartItems) {
			totalPrice = totalPrice + item.getPrice();
		}
		System.out.println("total price --" + totalPrice);
	}

	public void sortByPrice() {
		 ArrayList<Item> arr = new ArrayList(cartItems);
		Comparator<Item> com = (i1, i2) -> i1.getPrice() > i2.getPrice() ? 1 : -1;
		Collections.sort(arr, com);
		for (Item i : arr)
			System.out.println(i);

	}
	public void sortByItem() {
		 ArrayList<Item> arr = new ArrayList(cartItems);
		Collections.sort(arr,new SortItemById());
		for(Item i:arr) {
			System.out.println(i);
		}
	}

}
