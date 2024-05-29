package org.tyss.Hashset;

import java.util.Scanner;

public class ItemView {
	static Scanner read = new Scanner(System.in);

	public static Item createItem() {
		System.out.println("enter item id");
		System.out.println("enter item name");
		System.out.println("enter the price");
		Item item = new Item(read.nextInt(), read.next(), read.nextDouble());
		return item;
	}

	public static void main(String[] args) {
		ItemController controller = new ItemController();
		System.out.println("welcom to cart Application");
		while (true) {
			System.out.println("1. to save\n2. to search\n3. to remove\n4. to get total price\n5. to sort by price\n6. to sort by it\n7. to return");
			switch (read.nextInt()) {
			case 1:
				controller.addItem(createItem());
				break;
			case 3:
				controller.removeItem(createItem());
				break;
			case 2:
				controller.searcItem(createItem());
				break;
			case 4:
				controller.calculateTotalPrice();
				break;
			case 5:
				controller.sortByPrice();
				break;
			case 6:
				controller.sortByItem();
				break;
			case 7:
				return;
			}
		}
	}
}