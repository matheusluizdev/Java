package application;

import java.util.Scanner;

import entities.Person;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas:  ");
		int n = sc.nextInt();
		char genero;
		int somaHomens = 0, somaMulheres = 0;
		double altura, maiorAltura = 0, alturaMulheres = 0, mediaMulheres = 0, menorAltura = 10;

		Person[] vet = new Person[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa:  ");
			altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa:  ");
			genero = sc.next().charAt(0);

			vet[i] = new Person(altura, genero);

			if (vet[i].getAltura() > maiorAltura) {
				maiorAltura = vet[i].getAltura();
			}

			if (vet[i].getAltura() < menorAltura) {
				menorAltura = vet[i].getAltura();
			}

			if (vet[i].getGenero() == "f".charAt(0)) {
				somaMulheres++;
				alturaMulheres += vet[i].getAltura();
			}

			if (vet[i].getGenero() == "m".charAt(0)) {
				somaHomens++;
			}
		}

		mediaMulheres = alturaMulheres / somaMulheres;

		System.out.printf("Menor altura =  %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.print("Numeros de homens: " + somaHomens);

		sc.close();
	}
}