package ch06.x04JUnitParameterizedVsJUnitParams;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch06.x04JUnitParameterized.Calculator;
import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculatorJUnitParamsTest extends TestCase {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({
    	"2, 1, 3", 
    	"5, 2, 7"})
    public void addShouldAddTwoNumbers(int operand1, int operand2, int expectedSum) {
        assertEquals(expectedSum, calculator.add(operand1, operand2));
    }

    @Test
    @Parameters({
    	"2, 1, 1", 
    	"5, 2, 3"})
    public void subtractShouldSubtractTwoNumbers(int operand1, int operand2, int expectedDiff) {
        assertEquals(expectedDiff, calculator.subtract(operand1, operand2));
    }

    @After
    public void endTest() {
        calculator = null;
    }
}
