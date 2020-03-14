import org.junit.Test;
import static org.junit.Assert.*;
import Fib.java;

public class FibTest{

	@Test
	public void testRun() {
		result = Fib.run();
		expected = 4613732
		assertEquals(expected, result)
	}
	
}