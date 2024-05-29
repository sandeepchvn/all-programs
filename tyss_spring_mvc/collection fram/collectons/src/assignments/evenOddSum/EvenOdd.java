package assignments.evenOddSum;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class EvenOdd {
	private LinkedList<Integer> list_in = new LinkedList<Integer>();
	private Scanner read = new Scanner(System.in);

	public void addNumbersInList() {
		System.out.println("how many numbers you want to add ");
		int num = read.nextInt();
		System.out.println("enter " + num + " numbers");
		while (num != 0) {
			list_in.add(read.nextInt());
			num--;
		}
		Collections.sort(list_in);
		
	}
	public int BigEven() {
		Collections.reverse(list_in);
		System.out.println(list_in);
		for(int n:list_in) {
			if(n%2==0)
				return n;
		}
		return 0;
	}
	public int smallOdd() {
		Collections.reverse(list_in);
		System.out.println(list_in);
		for(int n:list_in) {
			if(n%2!=0)
				return n;
		}
		return 0;
	}

	public void sumOfEvenAndOddd() {
		System.out.println(BigEven() + smallOdd());
	}

}
