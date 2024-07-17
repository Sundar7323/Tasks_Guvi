package Task_9;

import java.util.Scanner;

public class Reverse_string {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String sentence =s.nextLine();
		
		String reversed ="";
		
		 for (int i = sentence.length() - 1; i >= 0; i--) {
	            reversed += sentence.charAt(i);
	        }
	        
	        System.out.println("Reversed string: " + reversed);
	}

}
