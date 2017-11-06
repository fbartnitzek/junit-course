package ch04.x02JUnitParams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import ch03.x01firstJUnitTest.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
	
	@Test
//	@Parameters(method="getMoney")
	@Parameters({ 
        "17, 'false'", 
        "22, 'true'" })
	public void testConstructorSetsAmountAndCurrency(int amount, String currency) {
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
	
	private static final Object[] getMoney() {
	    return new Object[]{
	                 new Object[]{10, "USD"},
	                 new Object[]{20, "EUR"},
	                 new Object[]{50, "CAD"}
	            };
	}

}
