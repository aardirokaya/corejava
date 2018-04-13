package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		  Integer   data[]  = {10,4,56,78,22,333};
		  List<Integer>  slist = Arrays.asList(data);
		
		  Collections.sort(slist,Collections.reverseOrder());
		  
		  System.out.println(slist);
		  
		  
	}

}
