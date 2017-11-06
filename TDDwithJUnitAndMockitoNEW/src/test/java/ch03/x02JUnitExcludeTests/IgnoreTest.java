package ch03.x02JUnitExcludeTests;

import org.junit.Ignore;
import org.junit.Test;


public class IgnoreTest {

	@Test
	public void shouldBeRun() {
		System.out.println("########################################");
		System.out.println("running!");
		System.out.println("########################################");
	}

	@Ignore
	@Test
	public void shouldBeIgnored() {
		System.out.println("huh, not ignored?!");
	}
}
