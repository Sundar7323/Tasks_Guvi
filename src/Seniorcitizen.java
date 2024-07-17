import java.util.Scanner;

public class Seniorcitizen {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the age");
	int age = sc.nextInt();
	
	if (age>=60) {
		System.out.println("The concerned person is a senior citizen");
	}
	else {
		System.out.println("The concerned person is not a senior citizen");
	}
}
}
