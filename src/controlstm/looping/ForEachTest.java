package controlstm.looping;

public class ForEachTest {
	
	
	public static void main(String[] args) {
		
		
		 int  data[] = {10,20,30,40,50,60};
		 
		 int sum = 0;
		 
		 for(int x : data ){
			 sum+= x;
			 System.out.println(x);
		 }
		 
		 System.out.println("Total ="+sum);
		
	}

}
