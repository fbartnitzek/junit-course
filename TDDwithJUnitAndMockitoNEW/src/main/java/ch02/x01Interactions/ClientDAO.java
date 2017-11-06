package ch02.x01Interactions;

import java.math.BigDecimal;

public interface ClientDAO {
	Short getClientType(long clientId);

	void saveBonusHistory(long clientId, BigDecimal bonus);
}
