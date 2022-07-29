package fileHandling;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class FileHandleAssign {
	  public static void main(String args[]) {
		  System.out.println("Enter the message to be printed onto the file: ");
		  Scanner s = new Scanner(System.in);
		  String data = s.nextLine();
	    
	    try {
	      
	      FileWriter output = new FileWriter("C://Users//POOJA//Desktop//Simplilearn//FileWriter.txt");

	      output.write(data);
	      System.out.println("Data is written to the file.");

	      output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	    

	    char[] array = new char[60];
	    
	    try {
	    	FileReader input = new FileReader("C://Users//POOJA//Desktop//Simplilearn//FileWriter.txt");
	    	
	         input.read(array);
		     System.out.println("Data in the file:");
		     System.out.println(array);

	      	 input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
	 }


