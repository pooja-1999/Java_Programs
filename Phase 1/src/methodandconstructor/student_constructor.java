package methodandconstructor;

public class student_constructor {

	String name;
	int age,subject1,subject2,subject3;
	char section;
	char gender;
	int total;
	float percent;
	
public student_constructor(int sub1, int sub2, int sub3, String n,char s,int g, char f){
	total = sub1 + sub2 + sub3;
	percent = total*100/3;
	name = n;
	section = s;
	age =g;
	gender = f;
	subject1 = sub1;
	subject2 =sub2;
	subject3 =sub3;
	}

public student_constructor(int sub2, int sub3, String n,char s,int g, char f){
	total = 0 + sub2 + sub3;
	percent = total*100/3;
	name = n;
	section = s;
	age =g;
	gender = f;
	subject1 = 0;
	subject2 =sub2;
	subject3 =sub3;
	}

void display()
{
	System.out.println(name+" "+section+" "+age+" "+" "+gender+" "+subject1+" "+subject2+" "+subject3+" "+total+" "+percent);
}  

public static void main(String args[]){  
    
    student_constructor s1 = new student_constructor(80,70,64,"Arya",'c',8,'F');  
    student_constructor s2 = new student_constructor(55,68,99,"Kira",'b',9,'M'); 
    student_constructor s3 = new student_constructor(80,70,"Manu",'a',9,'M');  
    student_constructor s4 = new student_constructor(55,68,"Liya",'a',8,'F');  
    
    s1.display();  
    s2.display();
    s3.display();
    s4.display();
   }  
}


