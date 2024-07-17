import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a =sc.nextInt();
		
		System.out.println("Enter the value of b");
		int b =sc.nextInt();
		
		System.out.println("Enter the value of c");
		int c =sc.nextInt();
		
		System.out.println("Enter the value of d");
		int d =sc.nextInt();
		
		int AB= a+b;
		int CD= c+d;
		
		if (AB>CD) {
			System.out.println("AB is greater");
		}
		else
		{
			System.out.println("CD is greater");
		}
		
	}
	
}
