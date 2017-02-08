import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTester {
	
	Calculator calculatorTester = new Calculator();
	
	int caseOne, caseTwo, caseThree, caseFour, caseNegThreeThousand, caseNegFour, caseTwoHundredMillion;
	@Before
	public void setUp() throws Exception{
		caseOne = 1;
		caseTwo = 2;
		caseThree = 3;
		caseFour = 4;
		caseNegFour = -4;
		caseNegThreeThousand = -3000;
		caseTwoHundredMillion = 200000000;
	}
	
	@Test
	public void testpressAdd(){
		assertEquals(3, calculatorTester.pressAdd(caseOne, caseTwo));
		assertEquals(-2998, calculatorTester.pressAdd(caseNegThreeThousand, caseTwo));
		assertEquals(199997000, calculatorTester.pressAdd(caseNegThreeThousand, caseTwoHundredMillion));
	}
	
	@Test
	public void testpressSubtract(){
		assertEquals(-1, calculatorTester.pressSubtract(caseOne, caseTwo));
		assertEquals(-3002, calculatorTester.pressSubtract(caseNegThreeThousand, caseTwo));
		assertEquals(-200003000, calculatorTester.pressSubtract(caseNegThreeThousand, caseTwoHundredMillion));
	}
	
	@Test
	public void testpressMultiply(){
		assertEquals(2, calculatorTester.pressMultiply(caseOne, caseTwo));
		assertEquals(-6000, calculatorTester.pressMultiply(caseNegThreeThousand, caseTwo));
		assertEquals(-800000000, calculatorTester.pressMultiply(caseNegFour, caseTwoHundredMillion));
	}
	
	@Test
	public void testpressDivide(){
		assertEquals(1, calculatorTester.pressDivide(2, 3));
		assertEquals(-1500, calculatorTester.pressDivide(caseNegThreeThousand, caseTwo));
		assertEquals(-50000000, calculatorTester.pressDivide(caseTwoHundredMillion, caseNegFour));
	}

}
