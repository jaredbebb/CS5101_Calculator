import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CalculatorTester {
	
	Calculator calculatorTester = new Calculator();
	
	int caseOne, caseTwo, caseThree, caseFour,caseNegThreeThousand, caseNegFour, caseTwoHundredMillion, caseNegTwoHundredMillion, caseTwoBillion;
	@Before
	public void setUp() throws Exception{
		caseOne = 1;
		caseTwo = 2;
		caseThree = 3;
		caseFour = 4;
		caseNegFour = -4;
		caseNegThreeThousand = -3000;
		caseTwoHundredMillion = 200000000;
		caseNegTwoHundredMillion = -200000000;
		caseTwoBillion = 2000000000;
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
	}
	@Test
	public void testpressDivide(){
		assertEquals(1, calculatorTester.pressDivide(2, 3));
		assertEquals(-1500, calculatorTester.pressDivide(caseNegThreeThousand, caseTwo));
		assertEquals(-50000000, calculatorTester.pressDivide(caseTwoHundredMillion, caseNegFour));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void addExceptionMessage() throws ArithmeticException {

	    thrown.expect(ArithmeticException.class);
	    thrown.expectMessage("integer overflow");
	    calculatorTester.pressAdd(caseTwoHundredMillion, caseTwoBillion);
	}
	@Test
	public void subtractExceptionMessage() throws ArithmeticException {

	    thrown.expect(ArithmeticException.class);
	    thrown.expectMessage("integer overflow");
	    calculatorTester.pressSubtract(caseTwoBillion, caseNegTwoHundredMillion);
	}
	@Test
	public void multiplyExceptionMessage() throws ArithmeticException {

	    thrown.expect(ArithmeticException.class);
	    thrown.expectMessage("integer overflow");
	    calculatorTester.pressMultiply(caseTwoBillion, caseTwoHundredMillion);
	}
}
