package labsession31;

public class RepeatInputString{

	public static void main(String[] args) {
		String input="a2b3c4";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<input.length();i+=2) {
			char ch=input.charAt(i);
			int count = Integer.parseInt(input.charAt(i+1) + "");
			
			for(int j=0;j<count;j++) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
