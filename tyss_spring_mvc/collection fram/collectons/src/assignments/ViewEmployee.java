package assignments;

import java.util.Scanner;

public class ViewEmployee {
	public static void main(String[] args) {
		EmployeeContoller ec = new EmployeeContoller();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter 1 to add\nenter 2 to get the avarage salary ");
			switch (sc.nextInt()) {
			case 1: {
				ec.addEmployee();
				break;
				
			}
			case 2: {
				ec.findAvgSalByDepName();
				break;
			}

			}
		}
	}
}
