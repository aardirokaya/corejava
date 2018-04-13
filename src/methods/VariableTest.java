package methods;

public class VariableTest {
	// 3 types of variables
		/*
		 * 1> local
		 * 2> instance
		 * 3> static (class variable)
		 * 4> Reference variable
		 */
	
	//instance variables
	int id;
	int age;
	String name;
	
	static String college;//static 
	
	
	
	public static void main(String[] args) {
		
		VariableTest  vt;//reference
		
	    vt = new VariableTest();
		vt.id = 111;
		
		int p,q,r,x,y; //local
		
	}
	
	 void print(){
		
		id = 222;
	}

}
