package utils;
import java.util.Currency;

public class CurrencyValidator {

	private void validateCurrency() {
		try {
			Currency.getInstance("EUY");
			System.out.println("expected currency : ");
		} catch (Exception e) {
			System.out.println("not a valid currency");
		}
	}
	
	public static void main(String args[]) {
		CurrencyValidator cv = new CurrencyValidator();
		cv.validateCurrency();
	}
	
}
