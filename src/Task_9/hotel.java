package Task_9;

import java.util.Scanner;

public class hotel {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month number: ");
	        int month = scanner.nextInt();

	        System.out.print("Enter the room rent per day: ");
	        double roomRent = scanner.nextDouble();

	        System.out.print("Enter the number of days stayed: ");
	        int daysStayed = scanner.nextInt();

	        boolean isPeakSeason = false;  // Checking whether it is a peak season
 
	        switch (month) {
	            case 4: case 5: case 6: case 11: case 12:
	                isPeakSeason = true;
	                break;
	            default:
	                isPeakSeason = false;
	        }

	        double totalTariff = roomRent * daysStayed;
	        if (isPeakSeason) {
	            totalTariff *= 1.20;
	        }

	        System.out.printf("Hotel tariff to be paid: %.2f\n", totalTariff);

	        scanner.close();
	    }
}
