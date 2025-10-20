package exercises_5;

import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		double depositValue;
		System.out.print("Is there an initial deposit? (y / n)");
		String resp = sc.next();

		if (resp.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
		} else {
			depositValue = 0.0;
		}

		Bank bank = new Bank(accountNumber, accountHolder, depositValue);

		System.out.println("Account data: ");
		System.out.println(bank);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double accountDeposit = sc.nextDouble();
		bank.depositValue(accountDeposit);
		System.out.println();

		System.out.println("Updated account data: ");
		System.out.println(bank);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double accountWithdraw = sc.nextDouble();
		bank.withdrawValue(accountWithdraw);
		System.out.println();

		System.out.println("Updated account data: ");
		System.out.println(bank);

		sc.close();
	}

}