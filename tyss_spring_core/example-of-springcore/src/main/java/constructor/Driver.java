package constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pan_person.xml");
	Pan pan =(Pan)context.getBean("myPan");
	System.out.println(pan.getNum());
	}
}
