package newProgram;

import java.util.Scanner;

public class fibonacciseries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n) for the Fibonacci series: ");

        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Number of terms cannot be negative.");
        } else if (n == 0) {
            System.out.println("Fibonacci series of 0 terms: ");
        } else if (n == 1) {
            System.out.println("Fibonacci series of 1 term: ");
            System.out.print("0");
        } else {
            System.out.println("Fibonacci series of " + n + " terms: ");

            long term1 = 0;
            long term2 = 1;

            System.out.print(term1 + " " + term2);

            for (int i = 3; i <= n; i++) {
                long nextTerm = term1 + term2;
                System.out.print(" " + nextTerm);

                term1 = term2;
                term2 = nextTerm;
            }
        }
        System.out.println();

        scanner.close();
    }
}
