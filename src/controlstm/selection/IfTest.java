package controlstm.selection;

public class IfTest {

	// Syntax:
	/*
	 * if(condition){
	 * 
	 * //statement-true }
	 */

	public static void main(String[] args) {

		int salary = 2000;

		if (salary < 5000) {
			salary = salary + 500;
		}

		System.out.println("Total salary = " + salary);
	}

}
