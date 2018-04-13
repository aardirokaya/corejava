package methods;

import java.awt.geom.Area;
import java.util.Scanner;

public class MethodTest {

	// static int l = 10;
	// static int b = 20;

	public static void main(String[] args) {

		// sum();
		// area(20,10);

		// float res = getParimeter();
		// System.out.println(res);

		int gt = findMaxValue(100, 500);
		System.out.println(gt);
	}

	// 1> no return-type with no arguments
	static void sum() {

		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of a and b?");
		a = sc.nextInt();
		b = sc.nextInt();

		int s = a + b;
		System.out.println("Sum =" + s);
	}

	// 2> no return-type with arguments
	static void area(int l, int b) {

		int a = l * b;
		System.out.println("Total area =" + a);
	}

	// 3> return-type with no arguments

	static float getParimeter() {

		float l = 20, b = 10;
		float p = 2 * (l + b);

		return p;
	}

	// 4> return-type with arguments

	static int findMaxValue(int x, int y) {

		if (x > y)
			return x;

		return y;
	}

}
