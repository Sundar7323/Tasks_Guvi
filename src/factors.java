
import java.util.Scanner;

public class factors {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

      
    }
}

