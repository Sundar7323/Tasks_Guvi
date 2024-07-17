package Task_9;

import java.util.Scanner;

public class anna_university {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the marks Obtained by the student");
		
		int marks=s.nextInt();
		
		if(marks>100) {
			System.out.println("Invalid Mark (Mark must be between 0-100)");
		}
		
		else if(marks==100) {
			System.out.println("The grade for the entered Mark is S");
			System.out.println("Congrats");
		}
		else if (marks >=90) {
			System.out.println("The grade for the entered Mark is A");
			}
		else if (marks >=80) {
			System.out.println("The grade for the entered Mark is B");
		}
		else if (marks >=70) {
			System.out.println("The grade for the entered Mark is C");
		}
		else if (marks >=60) {
			System.out.println("The grade for the entered Mark is D");
		}
		else if (marks >=50) {
			System.out.println("The grade for the entered Mark is E");
		}
		else {
			System.out.println("The grade for the entered Mark is F");
		}
		
	}
}
