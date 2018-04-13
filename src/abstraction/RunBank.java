package abstraction;

public class RunBank {
	
	public static void main(String[] args) {
		
		Bank b = new Laxmi();
		
		System.out.println("Name ="+b.getName());
		System.out.println("Rate ="+b.getRate());
		b.moneyEx();
		
		StudentService ss = new StudentServiceImpl();
		
		ss.addStudent();
		ss.deleteStudent();
		
	}

}
