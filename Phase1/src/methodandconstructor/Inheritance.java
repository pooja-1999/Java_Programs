package methodandconstructor;


class Product
{  
	int id=78;
	String name = "Amul";
	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name);
	}  
}

class A extends Product
{  
	int count = 50;
	String category = "Butter";
	void displays()
	{
		System.out.println("Count: "+count+" category: "+category);
	}  
}  
	

class B extends Product
{  
	
	int count = 90;
	String category = "Milk";
	void displays()
	{
		System.out.println("Count: "+count+" category: "+category);
	}  
} 

class C extends Product
{  
	int count = 56;
	String category = "Choco";
	void displays()
	{
		System.out.println("Count: "+count+" category: "+category);
	}  
}  
	

class SubA extends A
{  
	int price = 30;
	int totalprice = count*price;
	void displaying()
	{
		System.out.println("Total Price: "+totalprice);
	}  
} 

class SubB extends B
{  
	int price = 10;
	int totalprice = count*price;
	void displaying()
	{
		System.out.println("Total Price: "+totalprice);
	}  
} 



public class Inheritance {
	
	public static void main(String args[]){  
		
		SubA d=new SubA();
		d.display();
		d.displays();
		d.displaying();
		
		SubB m=new SubB();
		m.display();
		m.displays();
		m.displaying();
		
		C k=new C();
		k.display();
		k.displays();
		

}
}