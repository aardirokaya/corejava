package string;

public class Addition {

	public static void main(String[] args) {

		int mat1[][] = { { 10, 20, 30 }, { 4, 5, 6 }, { 70, 80, 10 } };
		int mat2[][] = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };

		int mat3[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				mat3[i][j] = mat1[i][j] + mat2[i][j];

				System.out.print(mat3[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
