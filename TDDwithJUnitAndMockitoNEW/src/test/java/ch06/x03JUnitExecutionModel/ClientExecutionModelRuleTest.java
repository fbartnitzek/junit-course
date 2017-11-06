package ch06.x03JUnitExecutionModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ClientExecutionModelRuleTest {
	
	private Client client;
	private Address a1;
	private Address a2;
	
	@Rule
	public final ExternalResource resource = new ExternalResource() {
		@Override
	    protected void before() throws Throwable {
			client = new Client();
			a1 = new Address("some street");
			a2 = new Address("some other street");
	    };
	    
//	    @Override
//	    protected void after() {
//	    	client = null;
//			a1 = null;
//			a2 = null;
//	    };
	};
	
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
