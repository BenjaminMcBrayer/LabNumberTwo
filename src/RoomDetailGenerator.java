import java.util.Scanner;

/*Benjamin McBrayer. The following Java console program calculates the area, perimeter, and volume of classrooms at Grand Circus
 based on user input. */

public class RoomDetailGenerator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double height = 0.0;
		int area = 0;
		int perimeter = 0;
		int volume = 0;
		String playAgain = null;

		System.out.println("Welcome to Grand Circus's Room Detail Generator!");

		// Request user input (length, width, and height).
		do {

			length = Validator.getDouble(scnr, "Enter length (in meters): ", 1.0, 1000.0);

			width = Validator.getDouble(scnr, "Enter width (in meters): ", 1.0, 1000.0);

			height = Validator.getDouble(scnr, "Enter height (in meters): ", 1.0, 1000.0);

			// Calculate area, perimeter, and volume.
			area = calculateArea(length, width);
			System.out.println("Area: " + area + " m");

			perimeter = calculatePerimeter(length, width);
			System.out.println("Perimeter: " + perimeter + " m");

			volume = calculateVolume(length, width, height);
			System.out.println("Volume: " + volume + " m");

			// Ask if the user wants to continue.
			playAgain = Validator.getString(scnr, "Continue? (y/n)");

		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");

		scnr.close();
	}

	public static int calculateVolume(double length, double width, double height) {
		int volume;
		volume = (int) (length * width * height);
		return volume;
	}

	public static int calculatePerimeter(double length, double width) {
		int perimeter;
		perimeter = (int) ((2 * length) + (2 * width));
		return perimeter;
	}

	public static int calculateArea(double length, double width) {
		int area;
		area = (int) (length * width);
		return area;
	}

}