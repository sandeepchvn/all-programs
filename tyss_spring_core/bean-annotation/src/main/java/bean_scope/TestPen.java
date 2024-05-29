package bean_scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPen {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Pen p = (Pen) context.getBean("pen");

		Pen p2 = (Pen) context.getBean("pen");
		System.out.println(p);
		System.out.println(p2);

	}
}
