package gitPackage;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Type java code by using if-else if() statement,
		 * If age is less than 13 output will be “Should not work”,
		 * If age is greater than 65 output will be “Retired”,
		 * Otherwise; output will be “Should work”
		 */
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter your age");
			int age = scan.nextInt();	
			
			if (age<13) {
				System.out.println("should not work");
			} else if (age >65) {
				System.out.println("Retired");
			} else {
				System.out.println("Should work");
			}
		System.out.println("Thank you!");
		System.out.println("Finish!");
		}
			

	}

}
