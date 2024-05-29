import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Employee e=new Employee();
		e.name="A";
		e.id=2;
		e.phone=553;
		employees.add(e);
		Employee e2=new Employee();
		e2.name="B";
		e2.id=1;
		e2.phone=773;
		employees.add(e2);
		Employee e3=new Employee();
		e3.name="C";
		e3.id=5;
		e3.phone=273;
		employees.add(e3);
		Collections.sort(employees);
		System.out.println(employees);
	}
}
