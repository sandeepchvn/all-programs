package bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Pen {

	public void write() {
		System.out.println("i am writing");
	}
}
