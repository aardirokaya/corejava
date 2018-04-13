package encapsulation;

public class RunEmployeee {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		 emp.setId(222);
		 emp.setName("Gopal");
		 emp.setSalary(900000);
		
		System.out.println("Id ="+emp.getId());
		System.out.println("Name ="+emp.getName());
		System.out.println("Salary ="+emp.getSalary());
	} 
}
