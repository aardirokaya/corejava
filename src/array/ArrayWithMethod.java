package array;

public class ArrayWithMethod {

	public static void main(String[] args) {

		int x[] = { 10, 20, 3, 40, 50 };

		//sumOfArray(new int[] { 100, 20, 30, 40, 500 });
		System.out.println(findSmall(x));
	}

	static void sumOfArray(int data[]) {

		int s = 0;
		for (int x : data) {

			s += x;
		}
		System.out.println("Total =" + s);

	}

	static int findSmall(int arr[]) {

		int sval = arr[0];

		for (int x : arr) {

			if (sval > x) {

				sval = x;
			}
		}

		return sval;
	}

}
