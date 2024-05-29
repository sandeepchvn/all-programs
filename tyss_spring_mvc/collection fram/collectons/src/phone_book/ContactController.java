package phone_book;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ContactController {
	private TreeSet<Contact> contacts=new TreeSet<Contact>();
	private Scanner r=new Scanner(System.in);
	public void add() {
		Contact contact=new Contact();
		System.out.println("enter the name");
		contact.setName(r.next());
		System.out.println("enter the number");
		contact.setPhone(r.nextLong());
		contacts.add(contact);
	}
	public void delete() {
		System.out.println("enter name to delete contact");
		String name=r.next();
		Contact removeCon=new Contact();
		for(Contact c:contacts) {
			if(c.getName().equalsIgnoreCase(name)) {
				removeCon=c;
			}
		}
		if(removeCon != null) {
			contacts.remove(removeCon);
			System.out.println("contact is deleted");
		}
		else
			System.err.println("entered name is not present to delete the contact");
	}
	public void findContact() {
		System.out.println("enter name to find contact");
		String name=r.next();
		boolean found=false;
		for(Contact c:contacts) {
			if(c.getName().equalsIgnoreCase(name)) {
				found=true;
				System.out.println("name "+c.getName());
				System.out.println("phone "+c.getPhone());
			}
		}
		if(found==false) {
			System.err.println("entered contact name is not present");
		}
	}
	public void editContact() {
		System.out.println("enter name to edit the contact");
		String name=r.next();
		Iterator<Contact> it=contacts.iterator();
		Contact c=new Contact();
		while(it.hasNext()) {
			if((it.next()).getName().equalsIgnoreCase(name)) {
				c=it.next();
			}
		}
		if(c != null) {
			System.out.println("enter new Number");
			c.setPhone(r.nextLong());
			System.out.println("done!---");
		}
		else
			System.err.println("entered name is not present");
	}
	public void findAll() {
		for(Contact c:contacts) {
			System.out.println("name "+c.getName());
			System.out.println("phone "+c.getPhone());
		}
	}
}