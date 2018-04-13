package string;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int data[] = {10,50,60,8,900,500,4,600};
		
		Arrays.sort(data);
		
        for(int i = data.length-1; i>=0; i--){
        	System.out.println(data[i]);
        }
	
		
	}

}
