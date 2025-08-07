package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the matrix length: ");
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("(" + i + ")(" + j + "): ");
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\nMatrix:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMain Diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println("\n\nNegative numbers:");
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		System.out.println("\nSecond diagonal: ");
		for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][n - 1 - i] + " ");
			}
		
		input.close();

	}

}
