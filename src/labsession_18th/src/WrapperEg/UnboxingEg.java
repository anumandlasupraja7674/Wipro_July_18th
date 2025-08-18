package WrapperEg;

public class UnboxingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unboxing = obj to datatype
		Integer a = new Integer(3);
		int i = a.intValue();
		
		int j = a;
		System.out.println(i);
		System.out.println(j);
		
		Byte b = new Byte((byte)10);
		Byte i1 = b.byteValue();
		System.out.println(i1);
		
		Short  s= new Short ((short)10);
		short  i2 = b.shortValue();
		System.out.println(i2);
		
		Long  l= new Long (10L);
		long  i3 = l.longValue();
		System.out.println(i3);
		
		Float  f= new Float(10F);
		float  i4 = f.longValue();
		System.out.println(i4);
		
		Double  d= new Double(104356);
		double  i5 = d.doubleValue();
		System.out.println(i5);
		
		Character  ch= new Character('S');
		char  i6 = ch.charValue();
		System.out.println(i6);
		
	   
		
		Boolean  bo= new Boolean(true);
		Boolean i8 = bo.booleanValue();
		System.out.println(i8);
		

	}

}
