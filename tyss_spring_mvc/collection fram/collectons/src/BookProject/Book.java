package BookProject;

public class Book implements Comparable<Book> {
	private int bid;
	private String title;
	private double price;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book() {

	}

	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book:[bid " + bid + " , " + " title " + title + " , " + " price " + price + " ]";
	}

	@Override
	public boolean equals(Object o) {
		Book b = (Book) o;
		if (this.price != b.price)
			return false;
		if (this.bid != b.bid)
			return false;
		if (!this.title.equalsIgnoreCase(b.title))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hc = bid;
		hc = hc + title.hashCode();
		hc = hc + Double.valueOf(price).hashCode();
		return hc;
	}

	@Override
	public int compareTo(Book b) {
		if (this.hashCode() > b.hashCode())
			return +3;
		if (this.hashCode() < b.hashCode())
			return -6;
		return 0;
	}
}
