import java.util.Comparator;

public class SortByPhone implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.phone>o2.phone) {
			return 1;
		}else if(o1.phone < o2.phone) {
			return -1;
		}
		return  o1.name;
	}

}
