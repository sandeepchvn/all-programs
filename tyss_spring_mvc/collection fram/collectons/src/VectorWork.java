import java.util.Enumeration;
import java.util.Vector;

public class VectorWork {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(4);
		v.add(3);
		v.add(22);
		v.add(77);
		v.remove(2);
		
		System.out.println(v);
//		Enumeration<Integer> e=v.elements();
//		while(e.hasMoreElements()) 
//		{
//			System.out.println(e.nextElement());
//		}
	}
}
