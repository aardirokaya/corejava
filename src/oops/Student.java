package oops;

public class Student {

	// properties

	int id;
	String fname;
	String lname;
	int age;

	// default constructor

	public Student() {

		id = 100;
		fname = "abc";
		lname = "xyz";
		age = 18;
	}

	public Student(int i, String fn) {

		id = i;
		fname = fn;
	}

	// Parameterized constructor

	Student(int id, String fname, String lname, int age) {

		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	// method
	void displayInfo() {

		System.out.println("Id =" + id);
		System.out.println("FirstName =" + fname);
		System.out.println("LastName =" + lname);
		System.out.println("Age =" + age);
	}

	public static void main(String[] args) {
		// object of Student
		Student s = new Student(222, "Ram", "Singh", 24);

		// s.id = 111;
		// s.fname = "Hari";
		// s.lname = "Sharma";
		// s.age = 20;
		s.displayInfo();

	}

}
