package labsession31;

public class NonRepChar {
    public static void main(String[] args) {
        String str1 = "aabbcdeffg"; 

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            
            
            if (str1.indexOf(ch) == str1.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No non-repeating");
    }
}

