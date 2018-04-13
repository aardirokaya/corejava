package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MapTest {
	
	public static void main(String[] args) {
		
		//Map<Integer, String>   hmap = new HashMap<>();
		//Map<Integer, String>   hmap = new TreeMap<>();
		Map<Integer, String>   hmap = new LinkedHashMap<>();
		
	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter your Id and Name?");
	
		
		  hmap.put(sc.nextInt(), sc.next());
		  hmap.put(5, "Hari");
		  hmap.put(12, "Suman");
		  hmap.put(85, "Gopal");
		  
		  for(Integer key : hmap.keySet()){
			  
			  System.out.println(hmap.get(key));
		  }
		
	}

}
