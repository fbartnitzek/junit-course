package ch02.x01Interactions;

import java.math.BigDecimal;

public interface Calculator {
	BigDecimal calculateBonus(Short clientType, BigDecimal payment);
}
