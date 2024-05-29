package Map;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(2, "B");
		hm.put(1, "A");
		hm.put(6, "z");
		hm.put(7, "B");
		hm.put(2, "hiiii");
		hm.put(4, "z");
		System.out.println(hm);
	}
}
