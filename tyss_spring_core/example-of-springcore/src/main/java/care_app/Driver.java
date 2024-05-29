package care_app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		User user=(User)context.getBean("myUser");
		System.out.println(user.getName());
		Car car=user.getCar();
		System.out.println(car.getBrand());
	}
}
