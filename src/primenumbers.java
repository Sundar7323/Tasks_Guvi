import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		 if (a <= 1) {
	            System.out.println("The given number is not a prime number.");
	        } else {
	            boolean isprime = true;

	            for (int i = 2; i <= Math.sqrt(a); i++) {
	                if (a % i == 0) {
	                    isprime = false;
	                    break;
	                }
	            }

	            if (isprime) {
	                System.out.println("The given number is a prime number.");
	            } else {
	                System.out.println("The given number is not a prime number.");
	            }
	}
}
}
