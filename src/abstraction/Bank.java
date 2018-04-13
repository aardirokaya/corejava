package abstraction;

public abstract class Bank {
	
	abstract String getName();
	abstract int getRate();
	
	void moneyEx(){
		
		System.out.println("$1 = 105");
		System.out.println("Ic. 100 = 160");
		System.out.println("KD 1 = 350");
	}

}
