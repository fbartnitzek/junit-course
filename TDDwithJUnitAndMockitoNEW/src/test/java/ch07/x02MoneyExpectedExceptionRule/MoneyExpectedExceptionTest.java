package ch07.x02MoneyExpectedExceptionRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch05.x01ExpectedException.Money;

public class MoneyExpectedExceptionTest {
	
	@Rule
	  public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testThrowsIAEForNegativeAmount() {
		thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("amount");
//	    thrown.expectMessage(startsWith("What"));
		new Money(-1, "USD");
	}
	
	@Test
	public void testThrowsIAEForNegativeCurrency() {
		thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("currency");
		new Money(1, "");
	}
	
	@Test
	public void testThrowsNoIAEForValidInputs() {
		new Money(1, "USD");
	}
	
}
