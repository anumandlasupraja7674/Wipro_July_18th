package class02Lab24;

import class01Lab24.Class01;

public class Class02 {
	
	public void empprint()
	{
		System.out.println(" emp Printing the data");
	}
	
	public static void main(String[] args)
	{
        Class01 obj = new Class01();
		Class02 obj1=new Class02();
		
		
        obj.ename(); //public
        obj.eid();
        //obj.sname(); //private
        //obj.cname(); //protected
        //obj.gname(); //default
        
        obj1.empprint();
	}
}
