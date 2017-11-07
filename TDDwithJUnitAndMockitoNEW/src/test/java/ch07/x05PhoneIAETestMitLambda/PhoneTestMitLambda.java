package ch07.x05PhoneIAETestMitLambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch07.x03PhoneIAETestMitTryFailCatch.Phone;
import ch07.x05JUnit4_ExceptionsMitJava8Lambda.ThrowableCaptor;

public class PhoneTestMitLambda {

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {
		Throwable actual = ThrowableCaptor.captureThrowable( () -> phone.setNumber(null));
		assertTrue(actual instanceof IllegalArgumentException);
		assertEquals("number can not be null or empty", actual.getMessage());
	}

	@Test
	public void shouldThrowIAEForPlusPrefixedNumber() {
		Throwable actual = ThrowableCaptor.captureThrowable(() -> phone.setNumber("+123"));
		assertTrue(actual instanceof IllegalArgumentException);
		assertEquals("plus sign prefix not allowed, number: [+123]", actual.getMessage());
	}
}
