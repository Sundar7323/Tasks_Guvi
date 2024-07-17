
import java.util.Scanner;

public class lengthguvi {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);


        System.out.println("Enter a string:");
        String inputString = sc.nextLine();


        int length = inputString.length();


        System.out.println("The length of the given string is: " + length);


    }
}