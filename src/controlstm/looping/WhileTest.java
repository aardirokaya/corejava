package controlstm.looping;

import java.util.Scanner;

public class WhileTest {
	
	//sysntax:
	
	/*
	 *   while (condition){
	 *   
	 *      //statements
	 *      //inc/dec
	 *   }
	 * 
	 */
	
	public static void main(String[] args) {
		
		 int a;
		 int b;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter first number?");
		 a = sc.nextInt();
		 System.out.println("enter second number");
		 b = sc.nextInt();
		 
		while (a<=b){
			
			System.out.println(a+"  "+(a*a)+"  "+(a*a*a));
			a++;
		}
		
	}

}
