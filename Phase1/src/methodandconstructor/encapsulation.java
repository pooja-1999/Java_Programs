package methodandconstructor;

class encaptest {

		   private int security_code;
		   private String branch_name;
		   private int branch_code;
		   private String dept_name;
		   private int dept_code;

		   
		public int getSecurity_code() {
			return security_code;
		}


		public void setSecurity_code(int security_code) {
			this.security_code = security_code;
		}


		public String getBranch_name() {
			return branch_name;
		}


		public void setBranch_name(String branch_name) {
			this.branch_name = branch_name;
		}


		public int getBranch_code() {
			return branch_code;
		}


		public void setBranch_code(int branch_code) {
			this.branch_code = branch_code;
		}


		public String getDept_name() {
			return dept_name;
		}


		public void setDept_name(String dept_name) {
			this.dept_name = dept_name;
		}


		public int getDept_code() {
			return dept_code;
		}


		public void setDept_code(int dept_code) {
			this.dept_code = dept_code;
		}
}

public class encapsulation {

		   public static void main(String args[]) {
		      encaptest encap = new encaptest();
		      encap.setSecurity_code(1783);
		      encap.setBranch_name("Science");
		      encap.setBranch_code(123);
		      encap.setDept_name("Physics");
		      encap.setDept_code(1231);
		      System.out.print("Security code : " + encap.getSecurity_code() + " Branch name : " + encap.getBranch_name()+" Branch code : "+encap.getBranch_code()+" Department name : " + encap.getDept_name() +" Department code : " + encap.getDept_code()  );
		   }

	}


