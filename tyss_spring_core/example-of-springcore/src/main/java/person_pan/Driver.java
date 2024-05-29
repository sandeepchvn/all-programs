package person_pan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("pan_person.xml");
		Person person=(Person)context.getBean("myPerson");
		System.out.println("name "+person.getName());
		
		Pan pan=person.getPan();
		System.out.println("pan number "+pan.getAddress());
	}
}
