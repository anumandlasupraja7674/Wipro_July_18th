package newprogram;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helloworld";
		char [] ch = {'h','e','l','l','o'};
		String s2 = new String(ch);
		System.out.println(s2);
		
		String s3 = new String("Hello");
		System.out.println(s3);
		
	 String str1= "supraja";
	 String str2="niharika";
	 //equals
	 
	 System.out.println(str1.equals(str2));
	 
	 System.out.println(str1.equalsIgnoreCase(str2));
	 
	 //Concat 
	 
	 System.out.println(str1.concat(str2));
	 
	 //contains 
	 System.out.println(str1.contains("p"));
	 
	 //substring 
	 
	 System.out.println(str1.substring(5));
	 System.out.println(str1.substring(0,3));
	 
	 //replace 
	 
	 System.out.println(str1.replace("j", "i"));
	 System.out.println(str1.replaceAll(str1, "nikitha"));
	 
	 //empty 
	 System.out.println(str1.isEmpty());
	 
	 //endswith 
	 
	 System.out.println(str1.endsWith("e"));
	 
	 //join 
	 String str3 = str1.join("_", "city","hyd");
	 
	 System.out.println(str3);
	 
	 //compare 
	 System.out.println(str2.compareTo(str3));
	 
	 
	 
	 
	 
	 
	 
		
		
		

	}

}
