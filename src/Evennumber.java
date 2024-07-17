import java.util.Scanner;

public class Evennumber {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the value a");
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("The given number is an even number");
		}
		else {
			System.out.println("The given number is a odd number");
		}
	}

}
