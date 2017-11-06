package ch03.x03IntegrationTests;

import org.junit.Test;


public class SomeIntegrationTestIT {

	@Test
	public void testMethod1() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("#########################");
		System.out.println("Integration Test running! (currentTimeMillis: " + System.currentTimeMillis() + ")");
		System.out.println("#########################");
	}
	
	@Test
	public void testMethod2() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("#########################");
		System.out.println("Integration Test running! (currentTimeMillis: " + System.currentTimeMillis() + ")");
		System.out.println("#########################");
	}

}
