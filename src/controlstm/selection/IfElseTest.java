package controlstm.selection;

import java.util.Scanner;

public class IfElseTest {

	// Syntax:
	/*
	 * if(condition){ //statement-true }else{ //statement-false }
	 * 
	 */

	public static void main(String[] args) {

		int n;

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter any number?");
		 n = sc.nextInt();
		 
		
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
