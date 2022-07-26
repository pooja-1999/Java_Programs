package Accessmodifier2;

import accessmodifier1.M;
import accessmodifier1.N;

public class Y {
	public static void main(String args[]) {
		new X().methodPublic();
		new X().methodProtected();
		new X().methodDefault(); 
		new M().methodPublic();
		new N().methodPublic();
				}

	public void methodPublic() {
		System.out.println("Class Y: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class Y: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class Y: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class Y: methodPrivate");
	}

}
