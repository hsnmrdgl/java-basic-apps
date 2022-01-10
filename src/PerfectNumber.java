import java.util.Scanner;

public class PerfectNumber {

	private static Scanner input;

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		
		input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		n = input.nextInt();
		
		for(int i=1; i<n; i++) {
			
			if(n%i==0) {
				sum = sum + i;
			}
		}
		
		if(sum == n) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}
	}

}
