package LabSession22;

import java.util.Scanner;

public class factorialVal {
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
	        return 1;
		}
		int res = 1;
		for(int i =1; i<=n; i++) {
			res *= i;
				
			}
			return res;
		}
		

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int result = factorial(number);
		
		System.out.println(result);
        sc.close();
		
		

	}

}

