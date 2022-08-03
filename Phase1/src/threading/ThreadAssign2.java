package threading;

class ThreadProcess {
	synchronized void printThread1(int n){  	
		  System.out.println("I am into the Process 1");
		  
		 {
			 int fact=1;
		     for(int i=1;i<=n;i++){
		    	 fact= fact*i;}
		      System.out.println("Factorial of "+n+" : "+fact);
		      try{  
				  Thread.sleep(30000);}
			 catch(Exception e){System.out.println(e);}  
				} 
			     }  
		
	synchronized void printThread2(int n1, int n2){  	
		  System.out.println("I am into the Process 2");
				  
		  {
			 int sum = n1+n2;
			 System.out.println("Sum of "+n1+" and "+n2+" = "+sum);
			 try{  
				  Thread.sleep(30000);}
			 catch(Exception e){System.out.println(e);}  
				} 
		
		  try{  
			  Thread.sleep(30000);}
		 catch(Exception e){System.out.println(e);}  
			}  
}
		  
		  
class MyThread1 extends Thread{  
		ThreadProcess t;  
		MyThread1(ThreadProcess t){  
			this.t=t;  
		}  
		public void run(){  
			System.out.println("Into the MyThread1 run() method");
			t.printThread1(4);  
		}  
}
		  
class MyThread2 extends Thread{  
		ThreadProcess t;  
		MyThread2(ThreadProcess t){  
			this.t=t;  
		}  
		public void run(){  
			System.out.println("Into the MyThread2 run() method");
			t.printThread1(6);  
		}  
} 

class MyThread3 extends Thread{  
	ThreadProcess t;  
	MyThread3(ThreadProcess t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("Into the MyThread3 run() method");
		t.printThread2(4,5);  
	}  
} 

class MyThread4 extends Thread{  
	ThreadProcess t;  
	MyThread4(ThreadProcess t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("Into the MyThread4 run() method");
		t.printThread2(10,20);  
	}  
} 
		  
public class ThreadAssign2{  
		
		public static void main(String args[]){  
		
		ThreadProcess obj = new ThreadProcess();
		
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		MyThread3 t3=new MyThread3(obj);  
		MyThread4 t4=new MyThread4(obj);  
		t2.start();  
		t4.start(); 
		t1.start();  
		t3.start(); 
		}  
}
