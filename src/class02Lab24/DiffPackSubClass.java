package class02Lab24;



import class01Lab24.Class01;


public class DiffPackSubClass extends Class01 
{
	public static void main(String[] args)
	{
		//Class01 obj1 = new Class01();
		
		DiffPackSubClass obj=new DiffPackSubClass();
		
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
				
				//obj.gid();
				//obj.gname();
				//obj.gtype();
		
				

	}
}
