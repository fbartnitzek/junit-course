package ch06.x03JUnitExecutionModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClientTest {
	
	@Test
	public void afterCreationShouldHaveNoAddress() {
		Client client = new Client();
		assertEquals(0 , client.getAddresses().size());
	}
	
	@Test
	public void shouldAllowToAddAddress() {
		Client client = new Client();
		Address a1 = new Address("some street");
		client.addAddress(a1);
		assertEquals(1 , client.getAddresses().size());
		assertTrue(client.getAddresses().contains(a1));
	}
	
	@Test
	public void shouldAllowToAddManyAddresses() {
		Client client = new Client();
		Address a1 = new Address("some street");
		Address a2 = new Address("some other street");
		client.addAddress(a1);
		client.addAddress(a2);
		assertEquals(2 , client.getAddresses().size());
		assertTrue(client.getAddresses().contains(a1));
		assertTrue(client.getAddresses().contains(a2));
	}
}
