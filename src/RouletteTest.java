import java.util.Scanner;




public class RouletteTest {

	/**
	 * Toy to test SimpleRouletteBets
	 * Lite version, not full functional
	 * @author yeotaJMU
	 * last update: 4/18/2013
	 */
	public static void main(String[] args) 
	{
		// Initialize SimpleRouletteBets
		// Run lite version program
		
		SimpleRouletteBets test = new SimpleRouletteBets();
		Scanner keyboard = new Scanner(System.in);
		
		test.startBankroll();
		System.out.println("Starting Bankroll: $" + test.bankroll);
		test.betAmount = Double.parseDouble(keyboard.nextLine());
		test.finalBet = keyboard.nextInt();//0-36 for number, 37 for black, 38 for red
		test.placeBet();
		System.out.println(test.result);
		System.out.println("Current Bankroll: $" + test.bankroll);

	}

}
