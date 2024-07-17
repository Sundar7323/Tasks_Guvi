package Task_9;

import java.util.Scanner;

public class patternsymbols {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no.of patterns");
		int size=s.nextInt();
		
		for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i == j) || (i + j == size + 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
