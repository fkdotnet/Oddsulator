import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int argu;
		Scanner scan = new Scanner(System.in);
		CalcWinnings C1 = new CalcWinnings();
		
		System.out.println("*******************************************");
		System.out.println("Basic Odds Calculator 0.1");
		System.out.println("*******************************************");
		System.out.println("Please select your task: \n [1] Calculate Possible Winnings \n [2] Create a Wager\n");
		argu = scan.nextInt();
		
	switch (argu) {
	case 1: C1.Calc();
			break;
	default: System.out.println("That's not coded yet!!!!!!");		
	}
		
		
		
		
	
	
	}
}
