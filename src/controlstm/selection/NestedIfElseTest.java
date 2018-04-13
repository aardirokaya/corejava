package controlstm.selection;

public class NestedIfElseTest {

	// Syntax:

	/*
	 * if(condition-1){
	 * 
	 * if(condition-2){
	 * 
	 * if(condition-3){
	 * 
	 * }else{
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }else{
	 * 
	 * }
	 * 
	 * }else{
	 * 
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {

		String citizen = "us";
		int age = 30;

		if (citizen.equals("nepali")) {

			if (age >= 18) {
				System.out.println("U can vote!!");
			} else {
				System.out.println("C U in  Next Election!!");
			}

		} else {
			System.out.println("U R Not Nepali!!");
		}

	}

}
