package ch06.x03JUnitExecutionModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClientExecutionModelTest {
	
	private Client client = new Client();
	private Address a1 = new Address("some street");
	private Address a2 = new Address("some other street");
	
	@Test
	public void afterCreationShouldHaveNoAddress() {
		assertEquals(0 , client.getAddresses().size());
	}
	
	@Test
	public void shouldAllowToAddAddress() {
		client.addAddress(a1);
		assertEquals(1 , client.getAddresses().size());
		assertTrue(client.getAddresses().contains(a1));
	}
	
	@Test
	public void shouldAllowToAddManyAddresses() {
		client.addAddress(a1);
		client.addAddress(a2);
		assertEquals(2 , client.getAddresses().size());
		assertTrue(client.getAddresses().contains(a1));
		assertTrue(client.getAddresses().contains(a2));
	}
}
