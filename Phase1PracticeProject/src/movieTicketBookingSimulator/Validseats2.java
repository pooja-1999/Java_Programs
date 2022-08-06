package movieTicketBookingSimulator;

import java.io.FileWriter;
import java.util.LinkedList;

public class Validseats2 {
	public void updatefile(LinkedList<String> arrayseat) {
		
		   try{
		      FileWriter writer = new FileWriter("D://ME//validseat2.txt");
		    
			  int len = arrayseat.size();
		      for (int i = 0; i < len; i++) {
		         writer.write(arrayseat.get(i) + "\t"+ "");
		      }
		      writer.close();
		   }
		   catch(Exception e) {
			      e.getStackTrace();
			    }
	   
	
}

}
