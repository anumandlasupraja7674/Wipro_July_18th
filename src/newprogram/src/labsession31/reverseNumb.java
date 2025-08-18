package labsession31;

public class reverseNumb {
    public static void main(String[] args) {
        
        int number = 7689;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10; //get last digit
            
            rev = rev * 10 + digit;   //add digit 
            System.out.println(rev); 
            number = number / 10;  //remove last digit 
        }

        System.out.println(rev);
    }
}

