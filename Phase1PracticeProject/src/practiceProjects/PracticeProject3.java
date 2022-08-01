//Write a program to read, write, and append to a file.

package practiceProjects;

import java.io.*;

public class PracticeProject3 {
	public static void main(String[] args) {
    
    try {
      //reading the file
      char[] array = new char[100];
      FileReader input = new FileReader("D://ME//phase1.txt");
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    
    try {
    	//writing the file
      String data = "This is the data that's written to the file.";
      FileWriter output = new FileWriter("D://ME//phase1.txt");
      output.write(data);
      System.out.println("Data is written to the file.");
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
    
    try {
    	//appending to the file
        String d = " This is the string that I append to the file";
        FileWriter fileWritter = new FileWriter("D://ME//phase1.txt",true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write(d);
        bw.close();
        System.out.println("Data is appended to the file");
     } 
    catch(Exception e){
        e.printStackTrace();
     }
}} 