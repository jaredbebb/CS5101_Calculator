import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTester {
	
	Calculator calculatorTester = new Calculator();
	
	int caseOne, caseTwo, caseThree, caseFour, caseNegThreeThousand, caseNegFour, caseTwoHundredMillion;
	String caseStringSI;
	@Before
	public void setUp() throws Exception{
		caseOne = 1;
		caseTwo = 2;
		caseThree = 3;
		caseFour = 4;
		caseNegFour = -4;
		caseNegThreeThousand = -3000;
		caseTwoHundredMillion = 200000000;
		caseStringSI = "SI";
	}
	
	@Test
	public void testpressAdd(){
		assertEquals(3, calculatorTester.pressAdd(caseOne, caseTwo));
	}
	
	@Test
	public void testpressSubtract(){
		assertEquals(-1, calculatorTester.pressSubtract(caseOne, caseTwo));
	}
	
	@Test
	public void testpressMultiply(){
		assertEquals(2, calculatorTester.pressMultiply(caseOne, caseTwo));
	}
	
	@Test
	public void testpressDivide(){
		assertEquals(1, calculatorTester.pressDivide(caseOne, caseTwo));
	}

}
