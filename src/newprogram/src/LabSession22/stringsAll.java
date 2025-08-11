package LabSession22;

public class stringsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Core Java";
				 
	    String s2 = "Selenium";
	    
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.concat(s2));
	    System.out.println(s1.contains("e"));
	    System.out.println(s1.substring(5));
	    System.out.println(s1.replace("J","S"));
	    System.out.println(s1.replaceAll(s1, "Python"));
	    System.out.println(s1.isEmpty());
	    System.out.println(s1.endsWith("g"));
	    
	 
	    String s3 = "Testing";
	    
	    String joinString = String.join(" ", s1, s2, s3);
	    System.out.println(joinString);
	    
	    
	    System.out.println(s1.compareTo(s2));
	    
	    String text="java is a program";
	    System.out.println(text.split(" "));
	    String[] result = text.split(" ");
	    for(String str: result) {
	    	System.out.println(str+" ");
	    }
	    
	
	    
				 

	}

}
