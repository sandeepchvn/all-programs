import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

public class StackWorking {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	s.add(44);
	s.add(33);
	s.add(9);
	s.add(88);
	s.add(44);
	System.out.println(s.lastElement());//88
	System.out.println(s.firstElement());//44
	Object o=s.clone();
	System.out.println(o+" oyye i am object");
	System.out.println(s.remove(1));
	System.out.println(s);
	System.out.println(s.pop());// removes the last element
	System.out.println(s.peek());
	s.clear();
	System.out.println(s.empty());
	
}
}
