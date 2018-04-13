package corejava;

public class OperatorTest {
	
	public static void main(String[] args) {
		
//		
//		int x = 10;
//		
//		System.out.println(x++);
//		System.out.println(x=x+5);
//		
//		System.out.println(++x);
//		System.out.println(x++ + ++x);
		
		int a = 200;
		
		System.out.println(a<<2);
		System.out.println(a<<5);// a*2*2*2*2*2
		
		System.out.println(a>>2); // a/(2*2)
		int b = 20;
		int c= 7;
		
		int g = (b>c)? b : c;
		
		System.out.println(g);
		
		
	}

}
