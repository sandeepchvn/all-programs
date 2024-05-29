package phone_book;

public class Contact implements Comparable<Contact>{
	private String name;
	private long phone;

	public Contact() {

	}

	public Contact(String name, long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public int compareTo(Contact o) {
		return this.name.compareTo(o.name);
	}
}
