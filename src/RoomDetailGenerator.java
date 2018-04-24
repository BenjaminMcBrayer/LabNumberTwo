import java.util.Scanner;

/*Benjamin McBrayer. The following Java console program calculates the area, perimeter, and volume of classrooms at Grand Circus
 based on user input. */

public class RoomDetailGenerator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String playAgain = null;

		System.out.println("Welcome to Grand Circus's Room Detail Generator!");
		// Request user input (length, width, and height).
		do {

			System.out.print("Enter length: ");
			length = scnr.nextDouble();

			System.out.print("Enter width: ");
			width = scnr.nextDouble();

			System.out.print("Enter height: ");
			height = scnr.nextDouble();
			// Calculate area, perimeter, and volume.
			area = (int) (length * width);
			System.out.println("Area: " + area);

			perimeter = (int) (2 * length) + (2 * width);
			System.out.println("Perimeter: " + perimeter);

			volume = (int) (length * width * height);
			System.out.println("Volume: " + volume);
			// Ask if the user wants to continue.
			System.out.println("Continue? (y/n)");

			playAgain = scnr.next();

		} while (playAgain.equalsIgnoreCase("y"));

		scnr.close();
	}

}