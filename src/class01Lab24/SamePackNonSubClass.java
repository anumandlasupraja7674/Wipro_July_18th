package class01Lab24;



public class SamePackNonSubClass extends Class01 
{
	public void emp() 
	{
		System.out.println("emp in sub class");
	}
	
	public static void main(String[] args) 
	{
	
		Class01 obj=new Class01();
		SamePackNonSubClass obj1=new SamePackNonSubClass();
		
		//public
		
				obj.ename();
				obj1.eid();
				obj1.edept();
				System.out.println();
				
				//private
				
				//obj.sname();
				//obj.sid();
				//obj.sdept();
				
				//protected
				
				obj1.cid();
				obj1.cname();
				obj1.cdept();
				
				// default
				
				obj1.gid();
				obj1.gname();
				obj1.gtype();

	}
}
