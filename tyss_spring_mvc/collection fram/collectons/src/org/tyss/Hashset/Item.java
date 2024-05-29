package org.tyss.Hashset;

public class Item {
	private int itemId;
	private String itemName;
	private double price;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item-" + itemId + " " + itemName + " " + price;
	}

	@Override
	public int hashCode() {
		return itemId;
	}

	@Override
	public boolean equals(Object obj) {
		return this.itemId == ((Item) obj).itemId;
	}
}
