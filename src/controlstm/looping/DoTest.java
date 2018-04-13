package controlstm.looping;

public class DoTest {
	
	//syntax:
	/*
	 *   do{
	 *   
	 *     //statemets
	 *     //inc/dec
	 *   
	 *   }while(condition);
	 * 
	 */
	
	public static void main(String[] args) {
		
		int n = 5, i=1;
	
		do{
			System.out.println(n+"*"+i+"="+n*i);
			i++;
			
		}while(i<=10);
		
	}

}
