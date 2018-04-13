package corejava;

public class DataTypeTest {
	
	public static void main(String[] args) {
		
		int x = 19000;
		long d = 53000000000000000l;
		float f = 98.75f;
		int num = 100_000_000;
		
		byte b = 127;
		
		System.out.println(Character.SIZE);
		System.out.println("Byte "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		
		System.out.println("Short "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		
		System.out.println("Int "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		
		System.out.println("Long "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);

		System.out.println("float "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);

		System.out.println("Doble"+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);

		
	}

}
