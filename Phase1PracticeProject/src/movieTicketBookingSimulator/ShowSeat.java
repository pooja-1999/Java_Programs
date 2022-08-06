package movieTicketBookingSimulator;

import java.io.FileWriter;
import java.util.LinkedList;

public class ShowSeat {
	public void SeatOccupied() 
	{
		 LinkedList<String> arrayseat = new LinkedList<String>();
		  arrayseat.add("A1");
		  arrayseat.add("A2");
		  arrayseat.add("A3");
		  arrayseat.add("A4");
		  arrayseat.add("A5");
		  arrayseat.add("B1");
		  arrayseat.add("B2");
		  arrayseat.add("B3");
		  arrayseat.add("B4");
		  arrayseat.add("B5");
		  arrayseat.add("C1");
		  arrayseat.add("C2");
		  arrayseat.add("C3");
		  arrayseat.add("C4");
		  arrayseat.add("C5");
		  arrayseat.add("D1");
		  arrayseat.add("D2");
		  arrayseat.add("D3");
		  arrayseat.add("D4");
		  arrayseat.add("D5");
		  arrayseat.add("E1");
		  arrayseat.add("E2");
		  arrayseat.add("E3");
		  arrayseat.add("E4");
		  arrayseat.add("E5");
 
		  
			   try{
			      FileWriter writer1 = new FileWriter("D://ME//validseat1.txt");     
				  int len = arrayseat.size();
			      for (int i = 0; i < len; i++) {
			         writer1.write(arrayseat.get(i) + "\t"+ "");
			      }
			      writer1.close();
			   }
			   catch(Exception e) {
				      e.getStackTrace();
				    }
			   

			   try{
			      FileWriter writer2 = new FileWriter("D://ME//validseat2.txt");     
				  int len = arrayseat.size();
			      for (int i = 0; i < len; i++) {
			         writer2.write(arrayseat.get(i) + "\t"+ "");
			      }
			      writer2.close();
			   }
			   catch(Exception e) {
				      e.getStackTrace();
				    }
			   

			   try{
			      FileWriter writer3 = new FileWriter("D://ME//validseat3.txt");     
				  int len = arrayseat.size();
			      for (int i = 0; i < len; i++) {
			         writer3.write(arrayseat.get(i) + "\t"+ "");
			      }
			      writer3.close();
			   }
			   catch(Exception e) {
				      e.getStackTrace();
				    }
			   

			   try{
			      FileWriter writer4 = new FileWriter("D://ME//validseat4.txt");     
				  int len = arrayseat.size();
			      for (int i = 0; i < len; i++) {
			         writer4.write(arrayseat.get(i) + "\t"+ "");
			      }
			      writer4.close();
			   }
			   catch(Exception e) {
				      e.getStackTrace();
				    }
			   

			   try{
			      FileWriter writer5 = new FileWriter("D://ME//validseat5.txt");     
				  int len = arrayseat.size();
			      for (int i = 0; i < len; i++) {
			         writer5.write(arrayseat.get(i) + "\t"+ "");
			      }
			      writer5.close();
			   }
			   catch(Exception e) {
				      e.getStackTrace();
				    }
		   
			   try{
				      FileWriter writer6 = new FileWriter("D://ME//validseat6.txt");     
					  int len = arrayseat.size();
				      for (int i = 0; i < len; i++) {
				         writer6.write(arrayseat.get(i) + "\t"+ "");
				      }
				      writer6.close();
				   }
				   catch(Exception e) {
					      e.getStackTrace();
					    }
		
	}	}

