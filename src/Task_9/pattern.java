package Task_9;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no.of Rows");
		int rows=s.nextInt();
        int number = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
	}
}
