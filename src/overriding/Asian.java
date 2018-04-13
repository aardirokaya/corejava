package overriding;

public class Asian extends Bank{
	
	@Override
	public String getName() {
		 
		return "Asian Bank";
	}
	
	@Override
	public int getRate() {
		 
		return 15;
	}
	

}
