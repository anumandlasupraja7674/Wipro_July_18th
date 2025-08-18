package class01Lab24;



public class Class01 {
	//private college 
	private String studName  = "supraja";
	private int studID = 101;
	private String studdept = "CSE";
	
	private void sname() {
		System.out.println(studName);
	}
	private void sid() {
		System.out.println(studID);
	}
	private void sdept() {
		System.out.println(studdept);
		
	}
	
	//public employee
	public String empName  = "supraja";
	public int empID = 101;
	public String empdept = "Developer";
	
	public void ename() {
		System.out.println(empName);
	}
	public void eid() {
		System.out.println(empID);
	}
	public void edept() {
		System.out.println(empdept); 
	}
		
	//protected customer 
		protected String custName  = "supraja";
		protected int custID = 101;
		protected String custdept = "CSE";
		
		protected void cname() {
			System.out.println(custName);
		}
		protected void cid() {
			System.out.println(custID);
		}
		protected void cdept() {
			System.out.println(custdept); 
		}
			
			//default
			 String gameName  = "supraja";
			 int gameID = 101;
			 String gametype = "running";
			
			void gname() {
				System.out.println(gameName);
			}
			void gid() {
				System.out.println(gameID);
			}
		     void gtype() {
				System.out.println(gametype); 
			}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class01 obj = new Class01();
		
		//private college
		obj.sname();
		obj.sid();
		obj.sdept();
		
		//public 
		
		obj.ename();
		obj.eid();
		obj.edept();
		
		//protected
		
		obj.cname();
		obj.cid();
		obj.cdept();
		
		//default
		
		obj.gname();
		obj.gid();
		obj.gtype();

	}

}
