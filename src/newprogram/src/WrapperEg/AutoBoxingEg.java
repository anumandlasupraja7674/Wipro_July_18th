package WrapperEg;

public class AutoBoxingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper is the process of converting the primitive datatypes into objectss
		
		//8 wrapper classes = byte, boolean, char, double, float, integer, short, long 
		
		//autoboxing convert datatype to obj
		
		int a = 78;
		Integer i = a;
		System.out.println(i);
		
		byte b = 10;
        Byte i1 = b;
        System.out.println(i1);

        short c = 20;
        Short i3 = c;
        System.out.println(i3);

       

        long l = 40L;
        Long i4 = l;
        System.out.println(i4);

        float f = 50.5f;
        Float i5 = f;
        System.out.println(i5);

        double d = 60.6;
        Double i6 = d;
        System.out.println(i6);

        char ch = 'A';
        Character i7 = ch;
        System.out.println(i7);

        boolean bool = true;
        Boolean i8 = bool;
        System.out.println(i8);

	}

}
