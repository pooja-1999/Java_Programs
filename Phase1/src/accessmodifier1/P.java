package accessmodifier1;

public class P {
	
	public static void main(String args[]) {
		new M().methodPublic();
		new M().methodProtected();
		new M().methodDefault(); 
		new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault(); 
		}
	public void methodPublic() {
		System.out.println("Class P:");
		System.out.println("Class P: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class P:");
		System.out.println("Class P: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class P:");
		System.out.println("Class P: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class P:");
		System.out.println("Class P: methodPrivate");
	}

}
