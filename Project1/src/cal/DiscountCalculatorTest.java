package cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameter;


class DiscountCalculatorTest {

	@ParameterizedTest
	@CsvSource({"2000,11","5500,12","1190,7"})
	void testdiscount(float price ,float discount) {
		DiscountCalculator d = new DiscountCalculator();
		float expected =price*discount/100;
		float actual = d.discount(price,discount);
		Assertions.assertEquals(expected,actual);
	}

}
