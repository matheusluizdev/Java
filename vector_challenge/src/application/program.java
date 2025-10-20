package application;

import java.util.Scanner;

import entities.Renter;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		String name, email;
		int numberOfRoom = 0;
		sc.nextLine();
		Renter[] vet = new Renter[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Number of room: ");
			numberOfRoom = sc.nextInt();
			sc.nextLine();
			vet[numberOfRoom] = new Renter(name, email);
			System.out.println();
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i].getName() + ", " + vet[i].getEmail());
			}
		}

		sc.close();
	}

}
