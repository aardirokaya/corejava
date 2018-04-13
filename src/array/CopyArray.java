package array;

import java.util.Arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		
		char from[] = {'n','e','p','a','l','k','t','m'};
		char to[]  = new char[4];
		
		System.arraycopy(from, 3, to, 0, 4);
		Arrays.sort(to);
		
		System.out.println(to);
		
		
	}

}
