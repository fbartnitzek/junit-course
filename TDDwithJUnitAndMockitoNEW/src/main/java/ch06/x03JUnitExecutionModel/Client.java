package ch06.x03JUnitExecutionModel;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Address> addresses = new ArrayList<Address>();

	public Client(Address addressA) {
		System.out.println(this);
	}

	public Client() {
		System.out.println(this);
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}

	public List<Address> getAddresses() {
		return addresses;
	}
}
