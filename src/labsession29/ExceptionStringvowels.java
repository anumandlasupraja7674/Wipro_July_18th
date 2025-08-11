package labsession29;

public class ExceptionStringvowels {

    public static void check(String str) throws Exception {
        if (!(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))) {
            throw new Exception("No vowels in the string");
        }
        System.out.println("String has vowels");
    }
public static void main(String[] args) {
    try {
    	String str = "skyyyyy";
        check(str);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
