package overriding;

public class Everest extends Bank{

	@Override
	public String getName() {
		 
		return "Everest Bank";
	}
	
	@Override
	public int getRate() {
		 
		return 12;
	}
	
}
