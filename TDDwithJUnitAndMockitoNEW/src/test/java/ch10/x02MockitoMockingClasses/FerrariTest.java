package ch10.x02MockitoMockingClasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class FerrariTest {

	private Ferrari myFerrari = mock(Ferrari.class);

	@Test
	public void testIfFerrariIsACar() {
		assertTrue(myFerrari instanceof Car);
	}
	
	@Test
	public void testIfFerrariIsAFerrari() {
		assertTrue(myFerrari instanceof Ferrari);
	}
	
	
	@Test
	public void testFerrariDefaultValues() {
		assertFalse(myFerrari.needsFuel());
		assertEquals(0.0, myFerrari.getEngineTemperature(), 0.0);
	}
}
