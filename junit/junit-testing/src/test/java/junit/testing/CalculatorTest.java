package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test1() {
		Calculator calculator = new Calculator();
		int actualresult = calculator.add(2, 3);
		int expectedresult = 5;
		Assertions.assertEquals(expectedresult, actualresult);
	}

	@Test
	void test2() {
		Calculator calculator = new Calculator();
		int actualsub=calculator.sub(5, 4);
		int expectedsub=1;
		Assertions.assertEquals(actualsub, expectedsub);
	}
	@Test
	void test3() {
		Calculator calculator = new Calculator();
		int actualsub=calculator.mul(3, 3);
		int expectedsub=9;
		Assertions.assertEquals(actualsub, expectedsub);
	}
}
