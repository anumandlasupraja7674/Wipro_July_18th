package LabSession22;

import java.util.Scanner;

public class floatPointComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first floating-point number: ");
        double num1 = input.nextDouble();

        System.out.print("Input second floating-point number: ");
        double num2 = input.nextDouble();

        num1 = Math.round(num1 * 100);
        num2 = Math.round(num2 * 100);

        if (num1 == num2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }

        input.close();
    }
}
