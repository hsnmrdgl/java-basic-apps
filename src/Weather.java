import java.util.Scanner;

public class Weather {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Is weather (R)ain or (S)unny? : ");
		String weather = input.nextLine();
		
		if(weather.toLowerCase().equals("s") || weather.toLowerCase().equals("sunny")){
			System.out.println("Degree ? :");
			int degree = input.nextInt();
			
			if(degree < 40) {
				System.out.println("You can go swim :)");
			}
			else
				System.out.println("Too hot! You should stay home!");
		}
		else if (weather.toLowerCase().equals("r") || weather.toLowerCase().equals("rain")){
			System.out.println("Its raining dont forget your umbrella.");
		}
		
		else {
			System.out.println("Please enter valid weather!");
		}
	}
}