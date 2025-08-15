package matrix;

import java.util.Scanner;

/* 
  Fazer um programa para ler dois números inteiros M e N, e depois ler uma 
  matriz de M linhas por N colunas, contendo números inteiros, podendo haver
  repetições. Em seguida, ler um número inteiro X que pertence à matriz. 
  Para cada ocorrência de X, quando houver.
 */

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leitura das dimensões da matriz

		System.out.print("Enter the number of rows and columns: ");
		int m = sc.nextInt(), n = sc.nextInt();

		int[][] mat = new int[m][n];

		// Leitura da matriz

		for (int i = 0; i < mat.length; i++) {
			System.out.printf("Enter %d numbers for line %d%n", n, i);
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// Exibindo matriz formada:

		System.out.println("Typed matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.println();
		}

		// Leitura do número para localizar:

		System.out.print("\nEnter a number to find: ");
		int x = sc.nextInt();

		// Localização do número e exibição dos vizinhos:

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.printf("Position %d, %d:%n", i, j);

					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j + 1 < n) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i + 1 < m) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
