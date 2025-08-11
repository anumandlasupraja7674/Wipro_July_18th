package newprogram;

public class Operators {

	public static void main(String[] args) {
		
		//unary
		
		
		int i=10;
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(++i);
		System.out.println(--i);
		
		//shift operator 
		//left 
		
		System.out.println(10 << 2);  //10*2^2 = 40 
		
		System.out.println(10 << 3);  //10*2^3 = 80
		
		//right 
		
		System.out.println(10 >> 2);   //10/2^2 = 2
		
		System.out.println(20 >> 2);   //20/2^2 = 5 
		
		System.out.println(20 >> 3);   //20/2^3 = 2 
		
		//relational 
		
		int x = 10;
		
		int y = 20;
		
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x == y);
		System.out.println(x != y);
		
		//shift 
		
		//left shift 
		System.out.println(10 << 2);
		System.out.println(10 << 4);
		
		//right
		System.out.println(10 >> 2);
		System.out.println(10 >> 4);
		
		// relational
		int a=10;
		int b=10;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a<b);
		
		//bitwise 
		
		//AND
		
		int p = 5;
		int q = 3;
		
		int r = p & q;
		
		System.out.println(r);
		
		int a1 = 8;
		int b1 = 2;
		
		int c1 = a1 & b1;
		
		System.out.println(c1);
		
		//OR 
		
		int a2 = 8;
		int b2 = 2;
		
		int c2 = a2 | b2;
		
		System.out.println(c2);
				
				
		
		//logical
		
		int a3=10;
		int b3 = 20;
		
		if (a3 < 20 && b3 >10) {
			System.out.println("true");
		}
		int age = 20;
		if (age < 25 || age > 20) {
			System.out.println("true");
		}
		boolean s=false;
		if(!s) {
			System.out.println("you did it");
		}
		
		
		//assignment 
		
		int k =10;
		int l =20;
		k += 4;
		System.out.println(k);
		l -= 4;
		System.out.println(l);
		
		//ternary
		
		int w1 = 10;
		int w2 = 20;
		
		int max = (w1 > w2) ? w1 : w2;
		
		System.out.println(max);
		
		
		 
		
		
		
		
		
		

	}

}
