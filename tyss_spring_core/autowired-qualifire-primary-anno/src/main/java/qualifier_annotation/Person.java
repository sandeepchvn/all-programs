package qualifier_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "qualifier_annotation")
@Configuration
public class Person {
	@Autowired
	@Qualifier(value = "nokia")
	Mobile mobile;
	
	// example for costructor
	public Person(@Qualifier(value = "moto") Mobile mobile) {
		
	}
	
	
}
