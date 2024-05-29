package BookProject;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
public static void main(String[] args) {
	ArrayList<Book> lib=new ArrayList<Book>();
	lib.add(new Book(1,"harry potter",800));
	lib.add(new Book(2,"barbie",700));
	lib.add(new Book(3, "mission impossible", 747));
	lib.add(new Book(4,"RRR",110));
	lib.add(new Book(5,"KGF",1000));
	lib.add(new Book(6,"KGF 1",1000));
	lib.add(new Book(7,"KGF 2",3000));
	lib.add(new Book(8,"KGF 3",1600));
	lib.add(new Book(9,"KGF 4",1700));
	lib.add(new Book(10,"KGF 5",1200));
	lib.add(new Book(11,"KGF 6",1600));
	lib.add(new Book(12,"KGF 7",1300));
	lib.add(new Book(13,"KGF 8",1800));
	lib.add(new Book(14,"KGF 9",1040));
	lib.add(new Book(15,"KGF 10",1300));
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the title of book to search");
	String title_name=sc.nextLine();
	boolean available=false;
	Book temp=null;
	//searching the book
	long start=System.nanoTime();
	for(Book b:lib) {
		if(title_name.equalsIgnoreCase(b.getTitle())) {
			//available
			available=true;
			temp=b;
		}
	}
	long end=System.nanoTime();
	// ending search
	System.out.println("time taken "+(end-start));
	if(temp != null) {
		System.out.println(temp.getTitle()+" is Available");
	}
	else {
		System.out.println("Book Not Available");
	}
	
}
}
