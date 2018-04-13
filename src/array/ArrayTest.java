package array;

import java.util.Scanner;

public class ArrayTest {
	
	//1> One dimensional array
	/*
	 *   Syntax:
	 *   
	 *   data-type  arr-name[] = new data-type[size];
	 */
	
	public static void main(String[] args) {
		
		int age[] = {10,20,50,40,30};
		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<5; i++){
//			System.out.println("Enter your age?");
//			age[i] = sc.nextInt();
//		}
		
//		age[0] = 15;
//		age[1] = 20;
//		age[2] = 30;
//		age[3] = 33;
//		age[4] = 18;
		
		//display
		
		for(int i=0; i<age.length; i++){
			
			System.out.println(age[i]);
		}
		
	}

}
