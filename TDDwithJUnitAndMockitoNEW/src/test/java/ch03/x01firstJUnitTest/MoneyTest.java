package ch03.x01firstJUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
	
	// testMoneyCreationAndGetters
	// hasAndReadAmounts
	@Test
	public void testConstructorSetsAmountAndCurrency() {
		Money money = new Money(10, "USD");
		System.out.println("MoneyTest failed?");
		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
	}
	
	@Test
	public void testConstructorSetsAmountAndCurrency2() {
		System.out.println("test");
	}
}
