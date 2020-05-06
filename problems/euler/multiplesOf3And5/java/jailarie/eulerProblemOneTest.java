import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class eulerProblemOneTest {

	@Test
	public void calculateMultiplesTestOne() {
		//asserts that the multiples of 3 and 5 in 10 will equal 23
		assertEquals(23, eulerProblemOne.calculateMultiples(10));
	}
	
}
