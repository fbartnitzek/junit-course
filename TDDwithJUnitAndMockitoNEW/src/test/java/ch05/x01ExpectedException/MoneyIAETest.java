package ch05.x01ExpectedException;

import org.junit.Test;

public class MoneyIAETest {
	// IllegalArgumentException
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowsIAEForNegativeAmount() {
		new Money(-1, "USD");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowsIAEForNegativeCurrency() {
		new Money(1, "");
	}
	
	@Test
	public void testThrowsNoIAEForValidInputs() {
		new Money(1, "USD");
	}
	
}
