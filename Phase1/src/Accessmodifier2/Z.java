package Accessmodifier2;

import accessmodifier1.M;
import accessmodifier1.N;
import accessmodifier1.P;

public class Z {
	
	public static void main(String args[]) {
		new M().methodPublic();
		new N().methodPublic();
		new P().methodPublic();
		new X().methodPublic();
		new X().methodProtected();
		new X().methodDefault(); 
			}
		
		
	

}
