
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	long phone;

	@Override
	public int compareTo(Employee o) {

		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;

		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}
