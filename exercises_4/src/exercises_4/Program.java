package exercises_4;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars you will bought? ");
		double dollarsBought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter.calculatorDollar(dollarPrice, dollarsBought));
		
		sc.close();
	}

}
