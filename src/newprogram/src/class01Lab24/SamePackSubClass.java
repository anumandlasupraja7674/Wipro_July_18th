package class01Lab24;

public class SamePackSubClass extends Class01
{
	public void read()
	{
		System.out.println("Reading in sub class");
	}
	
	public static void main(String[] args)
	{
		SamePackSubClass obj= new SamePackSubClass();
		
		//public
		
		obj.ename();
		obj.eid();
		obj.edept();
		System.out.println();
		
		//private
		
		//obj.sname();
		//obj.sid();
		//obj.sdept();
		
		//protected
		
		obj.cid();
		obj.cname();
		obj.cdept();
		
		// default
		
		obj.gid();
		obj.gname();
		obj.gtype();

	}
}