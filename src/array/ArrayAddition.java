package array;

public class ArrayAddition {

	public static void main(String[] args) {

		int mat1[][] = { { 10, 20 }, { 50, 90 } };
		int mat2[][] = { { 4, 5 }, { 7, 8 } };

		int mat3[][] = new int[2][2];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				mat3[i][j] = mat1[i][j] + mat2[i][j];

				System.out.print(mat3[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
