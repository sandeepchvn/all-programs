package Map;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(new Token(3, "2/4/2"),"hsshjghs");
		hm.put(new Token(1, "7/8/3"),"ahaa");
		hm.put(new Token(5, "2/6/4"),"eeye");
		
		System.out.println(hm);
	}
}

class Token {
	int no;
	String date;

	Token() {

	}

	Token(int no, String date) {
		this.no = no;
		this.date = date;
	}
	@Override
	public String toString() {
		return "no "+no+" date "+date;
	}
}