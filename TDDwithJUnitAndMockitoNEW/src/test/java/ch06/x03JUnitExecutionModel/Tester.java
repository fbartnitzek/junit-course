package ch06.x03JUnitExecutionModel;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tester {

	private List<String> list = new ArrayList<>();

	@Test
	public void testFirst() {
		System.out.println("first");
		list.add("one");
		assertEquals(1, list.size());
	}

	@Test
	public void testSecond() {
		System.out.println("second");
		assertEquals(0, list.size());
	}

}
