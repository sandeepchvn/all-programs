import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(8);
		arr.add(9);
		arr.add(3);
		arr.add(5);
		arr.add(8);
		arr.add(5);
		System.out.println("ArrayList -" + arr);
		HashSet h = new HashSet(arr);
		System.out.println("HashSet -" + h);
	}
}
