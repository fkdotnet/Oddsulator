import java.util.Scanner;

public class CalcWinnings {
int moneyLine;
int wagerIn;
int winnings;

public int Calc() {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Please enter the amount to be wagered: \n");
	wagerIn = sc1.nextInt();
	System.out.println("Please enter the odds on the bet: \n");
	moneyLine = sc1.nextInt();
	sc1.close();
	
	if(moneyLine > 0) {
		winnings = wagerIn * (moneyLine/100);
	}
	else { winnings = (wagerIn * 100/(moneyLine * -1));
	}
	
	System.out.println("The amount you would win would be: " + winnings );
return winnings; }  
}
