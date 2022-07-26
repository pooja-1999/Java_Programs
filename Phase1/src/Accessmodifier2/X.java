package Accessmodifier2;

public class X {
		

	private int y = 10;  
	long k = 1000; 
	protected float f = 3.45f;
	public char c = 'F';
	
	public void methodPublic(){    
		methodPrivate();
	}
	
	protected void methodProtected(){   
		methodPrivate();
	}
	
	void methodDefault(){   
		methodPrivate();
	}
	
	private void methodPrivate(){    
		System.out.println("Class X: ");
		System.out.println("Value of private int = "+ y);
		System.out.println("Value of default long  = "+ k);
		System.out.println("Value of protected float = "+f);
		System.out.println("Value of public char = "+c);
	}
}
