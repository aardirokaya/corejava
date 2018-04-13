package controlstm.selection;

public class IfElseLadder {

	// Syntax:
	/*
	 * if(condition-1){
	 * 
	 * }
	 * 
	 * else if(cond-2){
	 * 
	 * }
	 * 
	 * else if(cond-3){
	 * 
	 * } ..... ..... ....... else{
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {

		int marks = 85;

		String division;

		if (marks >= 80) {
			division = "Distinction";
		}

		else if (marks >= 60) {
			division = "First";
		}

		else if (marks >= 45) {
			division = "Second";
		}

		else if (marks >= 30) {
			division = "Third";
		} else {
			division = "Failed!!";
		}

		System.out.println(division);

	}

}
