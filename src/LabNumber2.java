import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
		
		//Calculate the perimeter and area of various classrooms based on user input
		
		//Declare and variables initialize
		
		Scanner sc = new Scanner(System.in);
		
		char yn = 'y';
		
		double l;
		double w;

		do {
			//prompt user
		
			System.out.println("Welcome to the Room Calculator!");
			System.out.print("Enter a length in feet: ");
			
			while (!sc.hasNextDouble()) {
				System.out.println("Try again, numbers only: ");
				sc.nextLine();
			}
			l = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("Enter a width in feet: ");
			
			while (!sc.hasNextDouble()) {
				System.out.println("Try again, numbers only: ");
				sc.nextLine();
			}
			w = sc.nextDouble();
			
			sc.nextLine();
			
			//calculate and output
			System.out.println("  Perimeter: " + ( 2*l + 2*w ) + " ft");
			System.out.println("  Area: " + (l * w) + " ft^2");
			
			
			//promt to run again
			System.out.print("Would you like to measure another room? (y/n): ");
					
			do {
				yn = sc.next().charAt(0);
				yn= Character.toLowerCase(yn);
				if (yn != 'y' && yn != 'n') {
					System.out.println("Sorry, please try again! (y/n): ");
				}
			} while (yn != 'y' && yn != 'n');
			
			sc.nextLine();
			System.out.println("----------------");
					
		} while (yn == 'y');
		
		System.out.println("See you later!");

	}

}
