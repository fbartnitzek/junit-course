package ch07.x03PhoneIAETestMitTryFailCatch;


public class Phone {
	private String number;

	public Phone() {
	}

	public void setNumber(String number) {
		if (null == number || number.isEmpty()) {
			throw new IllegalArgumentException("number can not be null or empty");
		}
		if (number.startsWith("+")) {
			throw new IllegalArgumentException(
					"plus sign prefix not allowed, number: [" + number + "]");
		}
		this.number = number;
	}
}
