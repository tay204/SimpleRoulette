package roulette;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 * Basic program for Roulette Bets
 * Methods for new game, making bets, spin wheel, save score
 * Authors: Thomas Yeo
 * last update: 4/30/2013
 */
public class SimpleRouletteBets 
{
	public double bankroll;
	public double betAmount;
	public int result;
	public int finalBet;
	public String playerName, output;
	
	DecimalFormat m = new DecimalFormat("##.00");
	
	//initialize bankroll
	public double startBankroll ()
	{
		bankroll = (bankroll + 1000.00);
		return bankroll;
	}
	//takes in bet from GUI
	public void placeBet()
	 {
		 if (betAmount <= 0)
		 {
			JOptionPane.showMessageDialog(null, "You must bet a positive amount!");
		
		 }
		
		 else if (betAmount > bankroll)
		 {
			JOptionPane.showMessageDialog(null, "You can't bet more than you have!");

		 }
		 else
		 {
			 bankroll = bankroll - betAmount;
			 spin();
		 }
	 }
	//generate rand, calculate results of spin
	 public void spin()
	 {
		 result = (int) (Math.random()*37);
		 if (finalBet <= 36)
		 {
			 if (result == finalBet)
			 {
				 bankroll = bankroll + (betAmount + (35 * betAmount));
				 JOptionPane.showMessageDialog(null, "You win $" + m.format(betAmount *35) + "!");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "You lost $" + m.format(betAmount) + "!");
				 bankroll = bankroll;
			 }	 
		 }
		 else if (finalBet == 37)
		 {
			 black();
		 }
		 else if (finalBet == 38)
		 {
			 red();
		 }
	 }
	 //considers all black numbers
	 public void black()
	 {
		 if ((result==2)||(result==4)||(result==6)||(result==8)||(result==10)
					||(result==11)||(result==13)||(result==15)||(result==17)||(result==20)
					||(result==22)||(result==24)||(result==26)||(result==28)||(result==29)
					||(result==31)||(result==33)||(result==35))
			{
			 	JOptionPane.showMessageDialog(null, "You win $" + m.format(betAmount) + "!");
				bankroll = bankroll + (betAmount*2);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You lost $" + m.format(betAmount) + "!");
				bankroll = bankroll;
			}			
		 
	 }
	 //considers all red numbers
	 public void red()
	 {
		 if ((result==1)||(result==3)||(result==5)||(result==7)||(result==9)
					||(result==12)||(result==14)||(result==16)||(result==18)||(result==19)
					||(result==21)||(result==23)||(result==25)||(result==27)||(result==30)
					||(result==32)||(result==34)||(result==36))
		 {
			 JOptionPane.showMessageDialog(null, "You win $" + m.format(betAmount) + "!");
			 bankroll = bankroll + (betAmount * 2);
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null, "You lost $" + m.format(betAmount) + "!");
			 bankroll = bankroll;
		 }
	 }	

	 //method to save score
	 public void saveScore()
	 {
		 playerName = JOptionPane.showInputDialog("Enter Player Name");
		 output = (playerName + ": $" + m.format(bankroll)); // to make easy string output
		 try
	       {
	    	   FileWriter fw = new FileWriter("out.txt",true);
	    	   BufferedWriter bw = new BufferedWriter(fw);
	    	   bw.write(output); //write output to txt file
	    	   bw.newLine();
	    	   bw.flush(); 
	    	   bw.close();
	       }
	       catch(Exception e)
	       {
	           e.printStackTrace();
	           JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
	       }
		 JOptionPane.showMessageDialog(null, "Save Complete!");
	 }
	 //method to display scores
	 public void showScore ()
	 {
		 try
		 {
			 FileReader fr = new FileReader("out.txt");
			 BufferedReader br = new BufferedReader(fr);
			 
			 String line;
			 
			 while((line = br.readLine()) != null)
			 {
			     JOptionPane.showMessageDialog(null, line);
			 }
			 br.close();
		 }
		catch (Exception e)
		{
		 	e.printStackTrace();
		 	JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
		}
	 }
	 
	//getters and setters
	double getBetAmount() 
	{
		return betAmount;
	}

	public void setBetAmount(int betAmount) 
	{
		this.betAmount = betAmount;
	}

	
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
	
	String getPlayerName ()
	{
		return playerName;
	}
	
	

}
