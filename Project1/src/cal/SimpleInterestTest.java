package cal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleInterestTest {

	@Test
	void testCalculateInterest() {
		SimpleInterest si = new SimpleInterest();
		float expected = 80;
		float actual =si.CalculateInterest(100,40,2);
		Assertions.assertEquals(expected,actual);
		
	}

}
