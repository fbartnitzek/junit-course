package ch06.x04JUnitParameterizedVsJUnitParams;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ch06.x04JUnitParameterized.Calculator;
import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class CalculatorJUnitParameterizedTest extends TestCase {
    private Calculator calculator;
    private int operand1;
    private int operand2;
    private int expectedSum;
    private int expectedDiff;

   

    public CalculatorJUnitParameterizedTest(int operand1, int operand2, int expectedSum, int expectedDiff) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.expectedSum = expectedSum;
		this.expectedDiff = expectedDiff;
	}

	@Parameters
    public static Collection<Object[]> setParameters() {
        Collection<Object[]> params = new ArrayList<>();
        // load the external params here
        // this is an example
        params.add(new Object[] {2, 1, 3, 1});
        params.add(new Object[] {5, 2, 7, 3});

        return params;
    }

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void addShouldAddTwoNumbers() {
        assertEquals(expectedSum, calculator.add(operand1, operand2));
    }

    @Test
    public void subtractShouldSubtractTwoNumbers() {
        assertEquals(expectedDiff, calculator.subtract(operand1, operand2));
    }

    @After
    public void endTest() {
        calculator = null;
        
    }
}
