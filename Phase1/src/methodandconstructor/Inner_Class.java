package methodandconstructor;

class Employee{
	
	int salary = 1000000;

	class PermEmployee {
		String Emp_code ="PE01";
		float hike = 0.45f;
		void new_salary()
		{float new_sal = salary + (salary*hike);
		System.out.println("New salary of permanent Employees = "+new_sal);} 
		void display()
		{System.out.println("salary = "+salary+" Employee code = "+Emp_code+" Employee hike = "+hike);}
		}
	
	class TempEmployee{
		String Emp_code ="TE01";
		float hike = 0.30f;
		void new_salary()
		{float new_sal = salary + (salary*hike);
		System.out.println("New salary of Temporary Employees = "+new_sal);}
		void display()
		{System.out.println("salary = "+salary+" Employee code = "+Emp_code+" Employee hike = "+hike);}
	    }

	void role()
	{
	   class ContractEmployee{
		   String Emp_code ="CE01";
			float hike = 0.30f;
			void new_salary()
			{float new_sal = salary + (salary*hike);
			System.out.println("New salary of contract Employees = "+new_sal);}
			void display()
			{System.out.println("salary = "+salary+" Employee code = "+Emp_code+" Employee hike = "+hike);}
	        }
	   ContractEmployee ConEmp = new ContractEmployee();
	   ConEmp.new_salary();
	   ConEmp.display();
	 }
}

	public class Inner_Class {
	    public static void main(String[] args) {

	        Employee Emp = new Employee();
	        Employee.PermEmployee Peremp = Emp.new PermEmployee();
	        Employee.TempEmployee Tememp = Emp.new TempEmployee();
	        Peremp.new_salary();
	 	    Peremp.display();
	 	    Tememp.new_salary();
		    Tememp.display();
		    Employee emp = new Employee();
		    emp.role();
	    }
	}
