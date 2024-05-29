package simple_example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import simple_example.Car;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Car.class);
		Car c = (Car) context.getBean("car");
		System.out.println(c.engine.cc);

	}
}
