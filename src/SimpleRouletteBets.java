import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Basic program for Roulette Bets
 * Methods for each bet type and odds
 * @author yeotaJMU
 * 3/14/2013
 */
public class SimpleRouletteBets 
{
	public double bankroll;
	private int betAmount;
	private int result;
	private int finalBet;
	private String makeBet;
	
	
	DecimalFormat money = new DecimalFormat("##.00");
	
	public double startBankroll ()
	{
		bankroll = (bankroll + 1000.00);
		return bankroll;
//		JOptionPane.showMessageDialog(null, "Your starting bankroll is $" + money.format(bankroll));
	}
	public void placeBet ()
	{
		JOptionPane.showMessageDialog(null, "You current bankroll is $" + money.format(bankroll));
		String newBet = JOptionPane.showInputDialog("Enter the amount to bet");
		betAmount = Integer.parseInt(newBet);
		while (betAmount <= 0)
		{
			JOptionPane.showMessageDialog(null, "You have to bet more than $0.00!");
			newBet = JOptionPane.showInputDialog("Enter the amount to bet");
			betAmount = Integer.parseInt(newBet);
		}
		while (betAmount > bankroll)
		{
			JOptionPane.showMessageDialog(null, "You can't bet more than you have!");
			newBet = JOptionPane.showInputDialog("Enter the amount to bet");
			betAmount = Integer.parseInt(newBet);
		}	
		JOptionPane.showMessageDialog(null, "You have bet $" + betAmount);
		bankroll = bankroll - betAmount;
		
		Object[] insideOutside = {"Inside (on a number)", "Outside (color, odd, etc)"};
		String inOut = (String) JOptionPane.showInputDialog(null, "Where would you like to make your bet?",
				"Roulette Bet",
				JOptionPane.PLAIN_MESSAGE,
				null,
				insideOutside,
				"Inside (on a number)");		
		
		if (inOut.equals("Inside (on a number)"))
		{
			Object[] insideBets = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14",
				"15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",
				"32","33","34","35","36"};
			String makeBet = (String) JOptionPane.showInputDialog(null, "What would you like to bet on?",
				"Roulette Bet",
				JOptionPane.PLAIN_MESSAGE,
				null,
				insideBets,
				"0");
			finalBet = Integer.parseInt(makeBet);	
			
			JOptionPane.showMessageDialog(null, "You bet $" + betAmount + " on " + makeBet + "."
					+ "\nGood luck!");		
			result = (int) (Math.random()*37);
		
			if (result == finalBet)
			{
				bankroll = bankroll + (betAmount + (35 * betAmount));
				JOptionPane.showMessageDialog(null, "Congratulations! You win $" + (betAmount + (35*betAmount)));
			}
			else
			{
				if (bankroll <= 0)
				{
					JOptionPane.showMessageDialog(null, "You lose, and you're broke! \nBetter luck next time!");
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You lose! Better luck next time!");
				}	
			}
			int replay = JOptionPane.showConfirmDialog(null, "Now you have $" + money.format(bankroll) + ".\n" + "Play again?", "Try Again", 
					JOptionPane.YES_NO_OPTION);
			if (replay == JOptionPane.YES_OPTION)
			{
				placeBet();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Gotta play to win! Until next time...");
				System.exit(0);
			}
		}
		else if (inOut.equals("Outside (color, odd, etc)"))
		{
			Object[] outsideBets = {"Black", "Red", "Even", "Odd", "First 3rd", "Second 3rd", "Third 3rd",
					"First Column", "Second Column", "Third Column"};
				String makeBet = (String) JOptionPane.showInputDialog(null, "What would you like to bet on?",
					"Roulette Bet",
					JOptionPane.PLAIN_MESSAGE,
					null,
					outsideBets,
					"Black");
			result = (int) (Math.random()*37);
			
			switch (makeBet)
			{
			case "Black":
				if ((result==2)||(result==4)||(result==6)||(result==8)||(result==10)
						||(result==11)||(result==13)||(result==15)||(result==17)||(result==20)
						||(result==22)||(result==24)||(result==26)||(result==28)||(result==29)
						||(result==31)||(result==33)||(result==35))
				{
					bankroll = bankroll + (betAmount*2);
					JOptionPane.showMessageDialog(null, "Congratulations! You win $" + (betAmount*2));
				}
				else
				{
					if (bankroll <= 0)
					{
						JOptionPane.showMessageDialog(null, "You lose, and you're broke! \nBetter luck next time!");
						System.exit(0);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "You lose! Better luck next time!");
					}	
				}			
				break;
			case "Red":
				if ((result==1)||(result==3)||(result==5)||(result==7)||(result==9)
						||(result==12)||(result==14)||(result==16)||(result==18)||(result==19)
						||(result==21)||(result==23)||(result==25)||(result==27)||(result==30)
						||(result==32)||(result==34)||(result==36))
				{
					bankroll = bankroll + (betAmount*2);
					JOptionPane.showMessageDialog(null, "Congratulations! You win $" + (betAmount*2));
				}
				else
				{
					if (bankroll <= 0)
					{
						JOptionPane.showMessageDialog(null, "You lose, and you're broke! \nBetter luck next time!");
						System.exit(0);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "You lose! Better luck next time!");
					}
				}	
				break;
			}
			int replay = JOptionPane.showConfirmDialog(null, "Now you have $" + money.format(bankroll) + ".\n" + "Play again?", "Try Again", 
					JOptionPane.YES_NO_OPTION);
			if (replay == JOptionPane.YES_OPTION)
			{
				placeBet();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Gotta play to win! Until next time...");
				System.exit(0);
			}
		}
			
	}
	

	public int getBetAmount() 
	{
		return betAmount;
	}

	public void setBetAmount(int betAmount) 
	{
		this.betAmount = betAmount;
	}


//	public double getStartingBankroll() {
//		return startingBankroll;
//	}
//
//
//	public void setStartingBankroll(double startingBankroll) {
//		this.startingBankroll = startingBankroll;
//	}
//	
	double getBankroll(){
		return bankroll;
	}
	
	public void setBankroll(double bankroll){
		this.bankroll = bankroll;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}
	
	
	

}
