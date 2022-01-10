import java.util.Scanner;

public class RandomMonth {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Enter number (1-12): ");
		int n = input.nextInt() - 1;
		
		System.out.print("Current month : ");
		switch(n) {
			case 0:
				System.out.println("January");
				break;
			case 1:
				System.out.println("February");
				break;
			case 2:
				System.out.println("March");
				break;
			case 3:
				System.out.println("April");
				break;
			case 4:
				System.out.println("May");
				break;
			case 5:
				System.out.println("June");
				break;
			case 6:
				System.out.println("July");
				break;
			case 7:
				System.out.println("August");
				break;
			case 8:
				System.out.println("September");
				break;
			case 9:
				System.out.println("October");
				break;
			case 10:
				System.out.println("November");
				break;
			case 11:
				System.out.println("December");
				break;
		}
		
		int days = (int)(Math.random() * (900 - 10));
		int year = days/365;
		int month = (days-(year*365))/30;
		 		
		System.out.println("After "+ year + " years and " + month + " months.("+ days + " days)");
		
		int next = (month+n)%12;
		
		System.out.print("New month : ");
		switch(next) {
			case 0:
				System.out.println("January");
				break;
			case 1:
				System.out.println("February");
				break;
			case 2:
				System.out.println("March");
				break;
			case 3:
				System.out.println("April");
				break;
			case 4:
				System.out.println("May");
				break;
			case 5:
				System.out.println("June");
				break;
			case 6:
				System.out.println("July");
				break;
			case 7:
				System.out.println("August");
				break;
			case 8:
				System.out.println("September");
				break;
			case 9:
				System.out.println("October");
				break;
			case 10:
				System.out.println("November");
				break;
			case 11:
				System.out.println("December");
				break;
		}	
	}
}