package assignments.evenOddSum;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		EvenOdd ev = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter 1 to add number\nenter 2 to calculate the sum of max even and min odd num");
			switch (sc.nextInt()) {
			case 1: {
				ev.addNumbersInList();
				break;
			}
			case 2: {
				ev.sumOfEvenAndOddd();
				break;
			}
			}
		}
	}
	
}
