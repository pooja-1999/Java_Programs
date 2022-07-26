package accessmodifier1;

public class N {
	
	public int i = 5;  
	protected long l = 800; 
	double d = 3.478;
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
		System.out.println("Class N:");
		System.out.println("Value of default double = "+ d);
		System.out.println("Value of protected long = "+ l);
		System.out.println("Value of public integer = "+ i);
	}

}
