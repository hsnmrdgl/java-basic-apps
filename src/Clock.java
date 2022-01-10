import java.util.Scanner;

public class Clock {

	private static Scanner input;

	public static void main(String[] args) {
		
		int hour = 0, min;
		
		input = new Scanner(System.in);
		
		System.out.println("Enter minute: ");
		int minute = input.nextInt();
		
		
		min = minute%60;
		hour = (int) (minute/60);
		
		System.out.println(hour + " hours and " + min + " minutes");
	
	}
}