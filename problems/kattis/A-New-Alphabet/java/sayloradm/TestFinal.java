package secondPackage;

import firstPackage.newAlphabet;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFinal {

	@Test
	public void test() {
		
		newAlphabet tester = new newAlphabet();
		
		String out = "\\/\\/0|Z|)$";
		
		assertEquals(out,tester.translate("words"));
	}
	

}
