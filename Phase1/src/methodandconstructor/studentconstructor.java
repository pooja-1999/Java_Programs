package methodandconstructor;

public class studentconstructor {
	   
		String name;  
	   	int age;
	   	char section,gender;
	   	int sub1,sub2,sub3;
	   	int total;
	   	float percent;
	    
	    studentconstructor(String n, int i, char s, char g, int s1, int s2, int s3){  
	      total = s1+s2+s3;
	      percent = total/3;
	      name=n; sub1=s1; sub2=s2; sub3=s3;
	      age = i;
	      section = s;
	      gender = g;
	      
	      
	    }     
	    
	    studentconstructor(String n, int i, char s, char g, int s2, int s3){  
		      total = s2+s3;
		      percent = total/3;
		      name=n; sub1=0; sub2=s2; sub3=s3;
		      age = i;
		      section = s;
		      gender = g;
		      
		    }    
	  
	    
	    void display()
	    {
	    	System.out.println(name+" "+age+" " +section+" "+gender+" "+sub1+" "+sub2+" "+sub3+" "+total+" "+percent);
	    }  
	   
	    public static void main(String args[]){  
	    
	    studentconstructor s1 = new studentconstructor ("Kira",8,'C','M',80,40,70);
	    studentconstructor s2 = new studentconstructor ("Liya",9,'A','F',70,30,70);
	    studentconstructor s3 = new studentconstructor ("Temo",8,'C','M',60,20,90);
	    studentconstructor s4 = new studentconstructor ("Asin",7,'B','F',30,90,70);
	    s1.display();  
	    s2.display();
	    s3.display();  
	    s4.display();  
	   }  
}  


