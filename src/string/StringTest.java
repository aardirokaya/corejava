package string;

public class StringTest {

	public static void main(String[] args) {

		String s = "Hello java string";

		System.out.println(s.trim().length());
		System.out.println(s.charAt(1));

		System.out.println(s.substring(6, 10));// b-a = 4-1=3

		String msg = String.format("Welcome to %s in nepal", "carlos");

		System.out.printf(msg);

	}

}
