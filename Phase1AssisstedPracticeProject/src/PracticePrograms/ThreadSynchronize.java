package PracticePrograms;

class Sender {
	
	
	    public void send(String msg) 
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1000); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class ThreadSync extends Thread 
	{ 
	    private String msg; 
	   	Sender sender; 
	    ThreadSync(String m, Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 
	class ThreadSynchronize
	{ 
	    public static void main(String args[]) 
	    { 
	    	Sender snd = new Sender(); 
	    	ThreadSync S1 = new ThreadSync( " Hi " , snd ); 
	    	ThreadSync S2 = new ThreadSync( " Bye " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 
	    } 
	} 



