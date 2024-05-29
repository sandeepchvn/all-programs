package phone_book;

import java.util.Scanner;

public class ContcatView {
	public static void main(String[] args) {
		System.out.println("Welcome to Phone Book Application");
		ContactController c=new ContactController();
		while(true) {
			System.out.println("enter 1 to add the contact");
			System.out.println("enter 2 to delete the contact");
			System.out.println("enter 3 to find the contact");
			System.out.println("enter 4 to edit the contact");
			System.out.println("enter 5 to find All the contact");
			System.out.println("enter 6 to exit");
			Scanner sc= new Scanner(System.in);
		try {	
			switch(sc.nextInt()) {
			case 1:{
				c.add();
				break;
			}
			case 2:{
				c.delete();
				break;
			}
			case 3:{
				c.findContact();
				break;
			}
			case 4:{
				c.editContact();
				break;
			}
			case 5:{
				c.findAll();
				break;
			}
			case 6:{
				return;
			}
			default : System.out.println("choice is wrong");
			}
		}catch(Exception e) {
			System.err.println("you entered wrong information");
		}
		}
	}
}