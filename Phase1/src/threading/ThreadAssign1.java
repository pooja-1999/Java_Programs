package threading;

class Customer{  
		int amount=10000;  
		  
			synchronized void withdraw(int amount){  
			System.out.println("going to withdraw..."+amount);  
			  
				if(this.amount<amount)
				{  
				System.out.println("Less balance; waiting for deposit...");  		
				try{
					wait();
				   }
				catch(Exception e){}  
				}  
				this.amount-=amount;  
				System.out.println("withdraw completed...the left over amount is "+ this.amount);  
			}  
		  
			synchronized void deposit(int amount){  
				System.out.println("going to deposit...");  
				this.amount+=amount;  
				
				System.out.println("deposit completed... " + this.amount);  
				notify(); 
			}  
		}  
		  
		public class ThreadAssign1{  
			public static void main(String args[]){  
				final Customer c=new Customer();  
				
				new Thread(){                
				  public void run()
				  {
					c.withdraw(5000);
				  }  
				}.start();
				new Thread(){                 
				  public void run()
				  {
					c.withdraw(4000);
				  }  
				}.start();  
				new Thread(){                 
					public void run()
					{
					 c.withdraw(10000);
					}  
				}.start();  
				
				new Thread(){  
				  public void run()
				   {
					 c.deposit(20000);
				   }  
				}.start();    
			}}

	
	 	



