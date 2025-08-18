package labsession23;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		//append
		sb.append("world");
		System.out.println(sb);
		//reverse 
		sb.reverse();
		System.out.println(sb);
		
		//isempty 
		
		sb.isEmpty();
		System.out.println(sb);
		
		sb.insert(2, "sup");
		System.out.println(sb);
		
		sb.delete(2,4);
		System.out.println(sb);
		
		sb.substring(5);
		System.out.println(sb);
		
		sb.replace(4, 8, "red");
		System.out.println(sb);
		
		sb.charAt(4);
		System.out.println(sb);
		
		sb.indexOf("l");
		sb.indexOf("e",3);
		System.out.println(sb);
		
		sb.length();
		System.out.println(sb);
	    //int count = 2;
	    //String newOne = "supraja";
		
		//sb.repeat(newOne,count);
		//System.out.println(sb);
		

	}

}
