import java.text.DecimalFormat;
import java.util.Scanner;

public class DartGame {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		double randX, randY;
		int n;
		int countA = 0, countB = 0, countC = 0, countD = 0 , countE = 0 ,countF = 0, countUndecied = 0;
		
		input = new Scanner(System.in);
		System.out.println("Enter count : ");
		
		n = input.nextInt();
		int count = n;
		
		while(n != 0) {
			
			randX = (Math.random() * (1+1)-1);
			randY = (Math.random() * (1+1)-1);
			
			double coord = randX + randY;
			
			
			System.out.println("Coordinates: ("+ df.format(randX) + "," + df.format(randY) + ")");
			
			//REGION UNDEFINED
			if ((randX > 0 && randY > 0 && (int)randX+randY == 1) || (randX < 0 && randY < 0 && randX == randY)) {
				System.out.println("Region undecied!");
				countUndecied++;
			}
			
			//REGION F
			else if(randX > 0 && randY < 0) {
				System.out.println("REGION F\n");
				countF++;
			}
			
			//REGION C
			else if(randX < 0 && randY > 0) {
				System.out.println("REGION C\n");
				countC++;
			}
			
			//REGION D
			else if (randX < 0 && randY < 0 && randX < randY) {
				System.out.println("REGION D\n");
				countD++;
				
			}
			
			//REGION E
			else if (randX < 0 && randY < 0 && randX > randY) {
				System.out.println("REGION E\n");
				countE++;
				
			}
			
			//REGION A
			else if(coord < 1) {
				System.out.println("REGION A\n");
				countA++;
			}
			
			//REGION B
			else if (coord > 1) {
				System.out.println("REGION B\n");
				countB++;
			}
			
			n--;
		}
		
		System.out.println("\n\nStatistic : ");
		System.out.println("Region A : " + countA + " darts " + "(%" +((countA*100)/count) + ")");
		System.out.println("Region B : " + countB + " darts " + "(%" +((countB*100)/count) + ")");
		System.out.println("Region C : " + countC + " darts " + "(%" +((countC*100)/count) + ")");
		System.out.println("Region D : " + countD + " darts " + "(%" +((countD*100)/count) + ")");
		System.out.println("Region E : " + countE + " darts " + "(%" +((countE*100)/count) + ")");
		System.out.println("Region F : " + countF + " darts " + "(%" +((countF*100)/count) + ")");
		System.out.println("Region Undecied : " + countUndecied + " darts " + "(%" +((countUndecied*100)/count) + ")");
		
	}
}
