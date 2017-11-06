package ch02.x01Interactions;

import java.math.BigDecimal;

public class FinancialService {

	ClientDAO clientDAO;
	Calculator calculator;

	public BigDecimal calculateBonus(long clientId, BigDecimal payment) {
		Short clientType = clientDAO.getClientType(clientId);
		BigDecimal bonus = calculator.calculateBonus(clientType, payment);
		clientDAO.saveBonusHistory(clientId, bonus);
		return bonus;
	}
}
