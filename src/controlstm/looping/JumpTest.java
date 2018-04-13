package controlstm.looping;

public class JumpTest {
	
	 //1. break;
	// 2.continue;
	//3.return;
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){
			
			if(i == 5){
				//break;
				//continue;
				return;
			}
			
			System.out.println(i);
		}
		
		System.out.println("after for loop");
		
	}

}
