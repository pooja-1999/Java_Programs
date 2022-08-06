/*First run "ShowSeat.java" in the same movieTicketBookingSimulator package.
 * After that only run this .java file(MovieTicketBooking.java)
 */



package movieTicketBookingSimulator;

import java.io.*;
import java.util.*;

public class MovieTicketBooking {
	  
	static String password ="password";
	static LinkedList<String> arrayseat1 = new LinkedList<String>(); 		    
	static LinkedList<String> arrayseat2 = new LinkedList<String>();
	static LinkedList<String> arrayseat3 = new LinkedList<String>();
	static LinkedList<String> arrayseat4 = new LinkedList<String>();
	static LinkedList<String> arrayseat5 = new LinkedList<String>();
	static LinkedList<String> arrayseat6 = new LinkedList<String>();			    

	  
	  public static void main(String[] args) {
	        /*System.out.println("Hello World!");*/
	        System.out.println("\n*****************************************************\n");
	        System.out.println("Welcome to the Movie Ticket Booking Application \n");
	        System.out.println("*****************************************************\n");
	        
	        useridentification();
	    }
	  public static void useridentification() {
	  
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
  
	   
	  String[] arr = {"1. Admin ",
          	   "2. Customer",
          	   "3. Exit"};
		        for(int i=0; i<arr.length;i++){
	            System.out.println(arr[i]);}
	  System.out.println("\nEnter anyone of the three options available:\n");       
	  Scanner sc = new Scanner(System.in);
      int  options =  sc.nextInt();
      for(int j=1;j<=3;j++){
          if(options==j){
              switch (options){
                  case 1:
                	  {
                		  System.out.println("\nYou Chose 'Admin' as user.\n");
                		  System.out.println("Enter your username and password: \n");
                			 Scanner c = new Scanner(System.in);
                			 String name = c.nextLine();
                			 String pass = c.nextLine();
                			 
                			 
                			 if(name.equals("username") && pass.equals(password)){
                		             frontdeskfunctions();	
                			 }
                			 else{System.out.println("\nInvalid username or password!\nTry Again...\n");}
            			   useridentification();
            			   break;
                	  }
                  case 2:
                  { 
                	  System.out.println("You Chose 'Customer' as user.\n");
                      Customerfunctions(arrayseat);
                      useridentification(); 
                      break;
                  }
                  case 3:
                	  {System.out.println("Closing your application... \nThank you!");
                	  break;}
                  default:
                	  {System.out.println("You have made an invalid choice!");
                      break;}
              				  }
              
          				}
         
      								}
      
}
	  

private static void frontdeskfunctions(){
	String[] arr = {"1. Update password","2. View seating arrangement",
	       	   "3. Booking status of each show",
	       	   "4. Exit"};
				System.out.println("\n");
			    for(int i=0; i<arr.length;i++){
		        System.out.println(arr[i]);}
			    System.out.println("\nEnter your option: \n");       
			    Scanner k = new Scanner(System.in);
			    int  o =  k.nextInt();
                if(o==1)     {
			                	  updatepassword();
			                	  frontdeskfunctions();
			                  }
                else if(o==2)              
			                  {
			                	  new SeatBooking().Seatingarrangement();
			                	  frontdeskfunctions();
			                  }  
                else if(o==3)               
			                  {
			                	  String[] arr1 = {"1. 5 August 2022 Morning Show: 09.00AM to 11.30AM ",
			               	       	   "2. 5 August 2022 Noon Show: 02.00PM to 4.30PM",
			               	       	   "3. 5 August 2022 Night Show: 09.00PM to 12.30AM",
			               	       	   "4. 6 August 2022 Morning Show: 09.00AM to 11.30AM ",
			               	       	   "5. 6 August 2022 Noon Show: 02.00PM to 4.30PM",
			               	       	   "6. 6 August 2022 Night Show: 09.00PM to 12.30AM"};
			                	  System.out.println("\nShows available for booking rightnow:\n");     
			                	  for(int i=0; i<arr1.length;i++){
			                      System.out.println(arr1[i]);}
			                	  
			                   try {
			       	                  char[] array = new char[100];
			       	                  FileReader input = new FileReader("D://ME//validseat1.txt");
			       	                  input.read(array);
			       	                  System.out.println("\nAvailable Seats for Show 1:\n");
			       	                  System.out.println(array);
			       	                  input.close();
			       	                   }
			       	              catch(Exception e) {
			       	                         e.getStackTrace();}
			       			  
			                   try {
			       	                  char[] array = new char[100];
			       	                  FileReader input = new FileReader("D://ME//validseat2.txt");
			       	                  input.read(array);
			       	                  System.out.println("\nAvailable Seats for show 2:\n");
			       	                  System.out.println(array);
			       	                  input.close();
			       	                  }
			       	              catch(Exception e) {
			       	                  e.getStackTrace();}
			       				            
			                   try {
				                      char[] array = new char[100];
				                	  FileReader input = new FileReader("D://ME//validseat3.txt");
				                	  input.read(array);
				                	  System.out.println("\nAvailable Seats for show 3:\n");
				                	  System.out.println(array);
				                	  input.close();
			       	                  }
			       	              catch(Exception e) {
			       	                      e.getStackTrace();}
			       				                    	
			       	           try {
			       	                    char[] array = new char[100];
			       	                    FileReader input = new FileReader("D://ME//validseat4.txt");
			       	                    input.read(array);
			       	                    System.out.println("\nAvailable Seats for show 4:\n");
			       	                    System.out.println(array);
			       	                    input.close();
			       	                   }
			       	              catch(Exception e) {
			       	                    e.getStackTrace();}
			       			
			                   try {
				                	   char[] array = new char[100];
				                	   FileReader input = new FileReader("D://ME//validseat4.txt");
				                	   input.read(array);
				                	   System.out.println("\nAvailable Seats for show 5:\n");
				                	   System.out.println(array);
				                	   input.close();
			       	                  }
			       	              catch(Exception e) {
			       	            	  e.getStackTrace();}
			        		       
			       	           try {
			                	   char[] array = new char[100];
			                	   FileReader input = new FileReader("D://ME//validseat6.txt");
			                	   input.read(array);
			                	   System.out.println("\nAvailable Seats for show 6:\n");
			                	   System.out.println(array);
			                	   input.close();
		       	                  }
		       	              catch(Exception e) {
		       	            	  e.getStackTrace();}
		
			       	           frontdeskfunctions();
			                  }

                else if(o==4)
			                	  {System.out.println("\n");
			                	  }
                else			{
			                	  System.out.println("You have made an invalid choice!");
			                	  }
                
			              				  }
			          				


private static void Customerfunctions(LinkedList<String> arrayseat){
	String[] arr1 = {"1. 5 August 2022 Morning Show: 09.00AM to 11.30AM ",
	       	   "2. 5 August 2022 Noon Show: 02.00PM to 4.30PM",
	       	   "3. 5 August 2022 Night Show: 09.00PM to 12.30AM",
	       	   "4. 6 August 2022 Morning Show: 09.00AM to 11.30AM ",
	       	   "5. 6 August 2022 Noon Show: 02.00PM to 4.30PM",
	       	   "6. 6 August 2022 Night Show: 09.00PM to 12.30AM",
	       	   "7. Exit"};
	  System.out.println("\nShows available for booking rightnow:\n");
 	  for(int i=0; i<arr1.length;i++){
 		  System.out.println(arr1[i]);}
	  System.out.println("\nEnter your option: \n");       
	  Scanner l = new Scanner(System.in);
	  int  os =  l.nextInt();
	  LinkedList<String> sec_list = new LinkedList<String>();
      sec_list = (LinkedList<String>) arrayseat.clone();

	        if(os==1)     {
	        			  String[] Arr1 = new String[25]; 
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[200];
	                	      FileReader input = new FileReader("D://ME//validseat1.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 1:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr1[k]=rowsel;
	                		   }
	                	  
	                	  System.out.println("\nPrice for One ticket = 200");
	                	  System.out.println("\nTotal amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {
	                		  Collections.addAll(arrayseat1, Arr1);
	                		  for(int i=0;i<sec_list.size();i++)
	                			 {for (int j=0;j<arrayseat1.size();j++)
	                			  {if((sec_list.get(i)).equals(arrayseat1.get(j)))
	                			    {sec_list.set(i,"Booked");}}}
	                		  new Validseats1().updatefile(sec_list);
	                	  }
	                	  Customerfunctions(arrayseat);
	                	  
	                 }  
	        else if (os == 2)
	                  {
	        			  String[] Arr2 = new String[25];
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[200];
	                	      FileReader input = new FileReader("D://ME//validseat2.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 2:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the above available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr2[k]=rowsel;
	                		   }
	                	  
	                	  System.out.println("\nPrice for One ticket = 200\n");
	                	  System.out.println("Total amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {	  
	                		  Collections.addAll(arrayseat2, Arr2);
	                		  for(int i=0;i<sec_list.size();i++)
	                			 {for (int j=0;j<arrayseat2.size();j++)
	                			  {if((sec_list.get(i)).equals(arrayseat2.get(j)))
	                			    {sec_list.set(i,"Booked");}}}
	                		  new Validseats2().updatefile(sec_list);
	                	  }
	                	  Customerfunctions(arrayseat);
	                	
	                  } 
	        else if (os == 3)
	                  {   String[] Arr3 = new String[25];
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[100];
	                	      FileReader input = new FileReader("D://ME//validseat3.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 3:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the above available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr3[k]=rowsel;
	                		   }
	                	  
	                	  System.out.println("\nPrice for One ticket = 200\n");
	                	  System.out.println("Total amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {
	                		  Collections.addAll(arrayseat3, Arr3);
	                		  for(int i=0;i<sec_list.size();i++)
	                			 {for (int j=0;j<arrayseat3.size();j++)
	                			  {if((sec_list.get(i)).equals(arrayseat3.get(j)))
	                			    {sec_list.set(i,"Booked");}}}
	                		  new Validseats3().updatefile(sec_list);
	                	  }
	                	 Customerfunctions(arrayseat);
	                  }
	        else if (os == 4)
	                  {   String[] Arr4 = new String[25];
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[100];
	                	      FileReader input = new FileReader("D://ME//validseat4.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 4:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the above available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr4[k]=rowsel;
	                		   }
	                	  System.out.println("Price for One ticket = 200\n");
	                	  System.out.println("\nTotal amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {
	                		  Collections.addAll(arrayseat4, Arr4);
	                		  for(int i=0;i<sec_list.size();i++)
	                			 {for (int j=0;j<arrayseat4.size();j++)
	                			  {if((sec_list.get(i)).equals(arrayseat4.get(j)))
	                			    {sec_list.set(i,"Booked");}}}
	                		  new Validseats4().updatefile(sec_list);
	                	  }
	                	  Customerfunctions(arrayseat);
	           		  }  
	        else if (os == 5)
	                  {   String[] Arr5 = new String[25];
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[100];
	                	      FileReader input = new FileReader("D://ME//validseat5.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 5:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the above available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr5[k]=rowsel;
	                		   }
	                	  System.out.println("\nPrice for One ticket = 200\n");
	                	  System.out.println("Total amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {
	                		  Collections.addAll(arrayseat5, Arr5);
	                		  for(int i=0;i<sec_list.size();i++)
	                		  	{for (int j=0;j<arrayseat5.size();j++)
	                		  		{if((sec_list.get(i)).equals(arrayseat5.get(j)))
	                		  			{sec_list.set(i,"Booked");}}}
	                		  new Validseats5().updatefile(sec_list);
	                	  }
	                	  Customerfunctions(arrayseat);
	                  }
	        else if (os == 6)
	                  {   String[] Arr6 = new String[25];
	                	  System.out.println("\nEnter the number of seats you want to book:\n");
	                	  int num = l.nextInt();
	                	  try {
	                	      //reading the file
	                	      char[] array = new char[100];
	                	      FileReader input = new FileReader("D://ME//validseat6.txt");
	                	      input.read(array);
	                	      System.out.println("Available Seats for show 6:");
	                	      System.out.println(array);
	                	      input.close();
	                	    }
	                	    catch(Exception e) {
	                	      e.getStackTrace();
	                	    }
	                	  System.out.println("\nEnter the seat you prefer from the above available seats:\nA(1-5)/B(1-5)/C(1-5)/D(1-5)/E(1-5)\nExample: A2,B4\n");
	                	  for(int k=0;k<=num;k++)
	                		  {
	                		  String  rowsel =  l.nextLine();
	                		  Arr6[k]=rowsel;
	                		   }
	                	  System.out.println("\nPrice for One ticket = 200\n");
	                	  System.out.println("Total amount to be paid: "+(200*num)+"\n");
	                	  int flag = payment();
	                	  if (flag == 1)
	                	  {
	                	  Collections.addAll(arrayseat6, Arr6);
	                	  for(int i=0;i<sec_list.size();i++)
              		  			{for (int j=0;j<arrayseat6.size();j++)
              		  				{if((sec_list.get(i)).equals(arrayseat6.get(j)))
              		  					{sec_list.set(i,"Booked");}}}
	                	  new Validseats6().updatefile(sec_list);
	                	  }
	                	 Customerfunctions(arrayseat);
	                  }
	        else if (os == 7)
	                	   {System.out.println("\n");}
	      	               
	      	               
	      	     else
	      	        	  {System.out.println("You have made an invalid choice!");}
	                	  
	               
	              }
	    

public static void updatepassword(){
			 System.out.println("\nEnter your new password: \n");
		  	 Scanner sc = new Scanner(System.in);
		     String pd = sc.nextLine();
		  	 System.out.println("\nYour password is updated!!! \n");
		  	 password = pd;
}
private static int payment(){
	int flag;
	System.out.println("Pay the amount? Y/N");
	Scanner sc = new Scanner(System.in);
    String pd = sc.nextLine();
	if((pd.equals("y")) || (pd.equals("Y"))){flag = 1;System.out.println("^^^^^Booking Confirmed^^^^^");}
	else{flag=0;System.out.println("Booking not Confirmed. Try Again!!!!!");}
	return flag;
}
}