package ch03.x01firstJUnitTest;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class MoneyTestAssertTrue {
	
	@Ignore
	@Test
	public void testConstructorSetsAmount() {
		Money money = new Money(10, "USD");
		System.out.println("MoneyTestAssertTrueAmount?");
		assertTrue( 11 == money.getAmount());
	}
	
	@Test
	public void testConstructorSetsCurrency() {
		Money money = new Money(10, "USD");
		assertTrue("USD".equals(money.getCurrency()));
	}
	
}
