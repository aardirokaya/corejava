package overriding;

public class Prime extends Bank{
	
	@Override
	public String getName() {
		
		return "Prime Bank";
	}
	
	@Override
	public int getRate() {
		
		return 10;
	}

}
