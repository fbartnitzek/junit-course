package ch05.x01ExpectedException;

public class Money {
	private final int amount;
	private final String currency;

	public Money(int amount, String currency) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException("amount must be positive!");
		}
		if (currency == null || currency.trim().isEmpty()) {
			throw new IllegalArgumentException("currency must not be empty or null!");
		} 
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	

}
