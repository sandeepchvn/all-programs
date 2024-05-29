package user_vehicles;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("user_vehicle.xml");
		User user = (User) context.getBean("myUser");
		List<Vehicle> v = user.getVehicles();
		for (Vehicle vehicle : v) {
			System.out.println(vehicle.getName());
		}
	}
}
