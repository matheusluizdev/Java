package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double calculatorDollar (double dollarPrice, double dollarsBought) {
		return (dollarPrice * dollarsBought) * IOF + (dollarPrice * dollarsBought);
	}
}
