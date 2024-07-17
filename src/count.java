import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		int count = 0;

        if (num == 0) {
            count = 1;
        } else {

            num = Math.abs(num);
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("The number of digits in the given integer is: " + count);

    }

}
