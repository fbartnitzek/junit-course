package ch10.x01MockitoIntro;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FifthMockitoVerificationTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();

		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
	}
	
	@Test
	public void testOtherVerification() {
//		myFerrari.getEngineTemperature();
//
//		verify(myFerrari).needsFuel();
	}
	
	@Test
	public void testVerificationOtherValue() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.driveTo("Sweet home Hoululu");
		myFerrari.driveTo("Sweet home Alabama");
		

		verify(myFerrari).driveTo("Sweet home Hoululu");
		
	}
}
