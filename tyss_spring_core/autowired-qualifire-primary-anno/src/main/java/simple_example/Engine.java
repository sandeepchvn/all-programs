package simple_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value(value = "420")
	int cc;
}
