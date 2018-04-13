package overriding;

public class RunBank {
	
	public static void main(String[] args) {
		
		//static binding or early binding
		Prime p = new Prime();
		
		System.out.println("Name ="+p.getName());
		System.out.println("Rate ="+p.getRate());
		p.moneyExchangeRate();
		
		//up casting
		
		Bank  ab = new Prime();
		displayInfo(ab);
	}
	
	//dynamic binding
	static void displayInfo(Bank b){
		
		System.out.println("Name ="+b.getName());
		System.out.println("Rate ="+b.getRate());
	}
	
 

}
