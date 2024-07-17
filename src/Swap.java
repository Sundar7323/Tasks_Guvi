import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a");
		int a =sc.nextInt();
		System.out.println("Enter the value b");
		int b =sc.nextInt();
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
}
