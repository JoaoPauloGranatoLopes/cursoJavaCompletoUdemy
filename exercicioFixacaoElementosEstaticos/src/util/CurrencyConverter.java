package util;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double dollarAmountToBeBought;

	public static double amountToBePaid() {
		return dollarPrice * dollarAmountToBeBought * 1.06;
	}

}
