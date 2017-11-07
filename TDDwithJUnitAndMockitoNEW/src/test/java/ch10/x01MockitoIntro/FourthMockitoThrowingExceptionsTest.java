package ch10.x01MockitoIntro;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FourthMockitoThrowingExceptionsTest {

	private Car myFerrari = mock(Car.class);

	@Test(expected = RuntimeException.class)
	public void throwException() {
		when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
		myFerrari.needsFuel();
	}
}
