package overriding;

public class User {
	
	int id;
	String name;
	Address address;
	
	
	User(int id, String name, Address address){
		
		this.id  = id;
		this.name = name;
		this.address = address;
	}
	
	
	public static void main(String[] args) {
		
		Address adr = new Address();
		adr.setCountry("Nepal");
		adr.setCity("Ktm");
		adr.setState("state-2");
		adr.setZip("977");
		
		User u = new User(11, "Hari", adr);
		
		System.out.println("Id ="+u.id);
		System.out.println("Name ="+u.name);
		System.out.println("Address ="+u.address);
//		System.out.println("City ="+u.address.getCity());
//		System.out.println("State ="+u.address.getState());
//		System.out.println("Zip  ="+u.address.getZip());
//		
//		System.out.println("====================================");
//		System.out.println(adr);
		
	}

}
