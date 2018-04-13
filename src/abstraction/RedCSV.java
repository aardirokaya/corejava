package abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RedCSV {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\student.csv"));
		String line;
		
		while((line= br.readLine()) != null){
		 
		  String[] data = line.split(",");
		  
		  System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+data[3]+"\t"+data[4]);
			
		}
		
	}

}
