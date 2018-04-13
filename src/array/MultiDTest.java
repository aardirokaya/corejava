package array;

import java.util.Scanner;

public class MultiDTest {

	// Syntax:
	/*
	 * data-type arry-name[][] = new data-type[row-size][col-size];
	 * 
	 */

	public static void main(String[] args) {

		int mat[][] = new int[2][2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println("Enter value for mat");
				mat[i][j] = sc.nextInt();
			}
		}

		// mat[0][0] = 10;
		// mat[0][1] = 20;
		// mat[1][0] = 30;
		// mat[1][1] = 40;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
