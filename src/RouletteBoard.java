import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RouletteBoard extends JApplet implements ActionListener
{
	private JButton zero, one, two, three, four, five, six, seven,
		eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, 
		sixteen, seventeen, eighteen, nineteen, twenty, twentyOne,
		twentyTwo, twentyThree, twentyFour, twentyFive, twentySix,
		twentySeven, twentyEight, twentyNine, thirty, thirtyOne, 
		thirtyTwo, thirtyThree, thirtyFour, thirtyFive, thirtySix,
		black, red; //firstThird, secondThird, thirdThird, firstColumn, 
//		secondColumn, thirdColumn, odd, even;
	private JTextField betAmount;
	private JTextArea guiBankroll;
	
	public void init()
	{
		SimpleRouletteBets master = new SimpleRouletteBets();
		
		Container board = getContentPane();
		board.setBackground(Color.GREEN);
		
		guiBankroll = new JTextArea("Current Bankroll: $" + (master.bankroll + 1000));
		
		//set up buttons
		zero = new JButton ("0");
		zero.addActionListener(this);
		zero.setBackground(Color.green);
		zero.setForeground(Color.BLACK);
		one = new JButton ("1");
		one.addActionListener(this);
		one.setBackground(Color.RED);
		one.setForeground(Color.WHITE);
		two = new JButton ("2");  
		two.setBackground(Color.BLACK);
		two.setForeground(Color.WHITE);
		two.addActionListener(this);
		three = new JButton ("3");
		three.addActionListener(this);
		three.setBackground(Color.RED);
		three.setForeground(Color.WHITE);
		four = new JButton ("4");
		four.addActionListener(this);
		four.setBackground(Color.BLACK);
		four.setForeground(Color.WHITE);
		five = new JButton ("5");
		five.addActionListener(this);
		five.setBackground(Color.RED);
		five.setForeground(Color.WHITE);
		six = new JButton ("6");
		six.addActionListener(this);
		six.setBackground(Color.BLACK);
		six.setForeground(Color.WHITE);
		seven = new JButton ("7");
		seven.addActionListener(this);
		seven.setBackground(Color.RED);
		seven.setForeground(Color.WHITE);
		eight = new JButton ("8");
		eight.addActionListener(this);
		eight.setBackground(Color.BLACK);
		eight.setForeground(Color.WHITE);
		nine = new JButton ("9");
		nine.addActionListener(this);
		nine.setBackground(Color.RED);
		nine.setForeground(Color.WHITE);
		ten = new JButton ("10");
		ten.addActionListener(this);
		ten.setBackground(Color.BLACK);
		ten.setForeground(Color.WHITE);
		eleven = new JButton ("11");
		eleven.addActionListener(this);
		eleven.setBackground(Color.BLACK);
		eleven.setForeground(Color.WHITE);
		twelve = new JButton ("12");
		twelve.addActionListener(this);
		twelve.setBackground(Color.RED);
		twelve.setForeground(Color.WHITE);
		thirteen = new JButton ("13");
		thirteen.addActionListener(this);
		thirteen.setBackground(Color.BLACK);
		thirteen.setForeground(Color.WHITE);
		fourteen = new JButton ("14");
		fourteen.addActionListener(this);
		fourteen.setBackground(Color.RED);
		fourteen.setForeground(Color.WHITE);
		fifteen = new JButton ("15");
		fifteen.addActionListener(this);
		fifteen.setBackground(Color.BLACK);
		fifteen.setForeground(Color.WHITE);
		sixteen = new JButton ("16");
		sixteen.addActionListener(this);
		sixteen.setBackground(Color.RED);
		sixteen.setForeground(Color.WHITE);
		seventeen = new JButton ("17");
		seventeen.addActionListener(this);
		seventeen.setBackground(Color.BLACK);
		seventeen.setForeground(Color.WHITE);
		eighteen = new JButton ("18");
		eighteen.addActionListener(this);
		eighteen.setBackground(Color.RED);
		eighteen.setForeground(Color.WHITE);
		nineteen = new JButton ("19");
		nineteen.addActionListener(this);
		nineteen.setBackground(Color.RED);
		nineteen.setForeground(Color.WHITE);
		twenty = new JButton ("20");
		twenty.addActionListener(this);
		twenty.setBackground(Color.BLACK);
		twenty.setForeground(Color.WHITE);
		twentyOne = new JButton ("21");
		twentyOne.addActionListener(this);
		twentyOne.setBackground(Color.RED);
		twentyOne.setForeground(Color.WHITE);
		twentyTwo = new JButton ("22");
		twentyTwo.addActionListener(this);
		twentyTwo.setBackground(Color.BLACK);
		twentyTwo.setForeground(Color.WHITE);
		twentyThree = new JButton ("23");
		twentyThree.addActionListener(this);
		twentyThree.setBackground(Color.RED);
		twentyThree.setForeground(Color.WHITE);
		twentyFour = new JButton ("24");
		twentyFour.addActionListener(this);
		twentyFour.setBackground(Color.BLACK);
		twentyFour.setForeground(Color.WHITE);
		twentyFive = new JButton ("25");
		twentyFive.addActionListener(this);
		twentyFive.setBackground(Color.RED);
		twentyFive.setForeground(Color.WHITE);
		twentySix = new JButton ("26");
		twentySix.addActionListener(this);
		twentySix.setBackground(Color.BLACK);
		twentySix.setForeground(Color.WHITE);
		twentySeven = new JButton ("27");
		twentySeven.addActionListener(this);
		twentySeven.setBackground(Color.RED);
		twentySeven.setForeground(Color.WHITE);
		twentyEight = new JButton ("28");
		twentyEight.addActionListener(this);
		twentyEight.setBackground(Color.BLACK);
		twentyEight.setForeground(Color.WHITE);
		twentyNine = new JButton ("29");
		twentyNine.addActionListener(this);
		twentyNine.setBackground(Color.BLACK);
		twentyNine.setForeground(Color.WHITE);
		thirty = new JButton ("30");
		thirty.addActionListener(this);
		thirty.setBackground(Color.RED);
		thirty.setForeground(Color.WHITE);
		thirtyOne = new JButton ("31");
		thirtyOne.addActionListener(this);
		thirtyOne.setBackground(Color.BLACK);
		thirtyOne.setForeground(Color.WHITE);
		thirtyTwo = new JButton ("32");
		thirtyTwo.addActionListener(this);
		thirtyTwo.setBackground(Color.RED);
		thirtyTwo.setForeground(Color.WHITE);
		thirtyThree = new JButton ("33");
		thirtyThree.addActionListener(this);
		thirtyThree.setBackground(Color.BLACK);
		thirtyThree.setForeground(Color.WHITE);
		thirtyFour = new JButton ("34");
		thirtyFour.addActionListener(this);
		thirtyFour.setBackground(Color.RED);
		thirtyFour.setForeground(Color.WHITE);
		thirtyFive = new JButton ("35");
		thirtyFive.addActionListener(this);
		thirtyFive.setBackground(Color.BLACK);
		thirtyFive.setForeground(Color.WHITE);
		thirtySix = new JButton ("36");
		thirtySix.addActionListener(this);
		thirtySix.setBackground(Color.RED);
		thirtySix.setForeground(Color.WHITE);
		
		black = new JButton ("Black");
		black.addActionListener(this);
		black.setBackground(Color.BLACK);
		black.setForeground(Color.WHITE);
		red = new JButton ("Red");
		red.addActionListener(this);
		red.setBackground(Color.RED);
		red.setForeground(Color.WHITE);
		
		betAmount  = new JTextField("Enter Bet Amount");
		
		
		board.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//number buttons
		c.gridx = 0;
		c.gridy = 0;
		board.add(guiBankroll, c);
		c.gridx = 0;
		c.gridy= 1;
		c.anchor = GridBagConstraints.EAST;
		board.add(zero, c);
		c.gridx = 1;
		c.gridy = 2;		
		board.add(one, c);
		c.gridx = 1;
		c.gridy = 1;
		board.add(two, c);
		c.gridx = 1;
		c.gridy = 0;
		board.add(three, c);
		c.gridx = 2;
		c.gridy = 2;
		board.add(four, c);
		c.gridx = 2;
		c.gridy = 1;
		board.add(five, c);
		c.gridx = 2;
		c.gridy = 0;
		board.add(six, c);
		c.gridx = 3;
		c.gridy = 2;
		board.add(seven, c);
		c.gridx = 3;
		c.gridy = 1;
		board.add(eight, c);
		c.gridx = 3;
		c.gridy = 0;
		board.add(nine, c);
		c.gridx = 4;
		c.gridy = 2;
		board.add(ten, c);
		c.gridy = 1;
		board.add (eleven, c);
		c.gridy = 0;
		board.add(twelve, c);
		c.gridx = 5;
		c.gridy = 2;
		board.add(thirteen, c);
		c.gridy = 1;
		board.add(fourteen, c);
		c.gridy = 0;
		board.add(fifteen, c);
		c.gridx = 6;
		c.gridy = 2;
		board.add(sixteen, c);
		c.gridy = 1;
		board.add(seventeen, c);
		c.gridy = 0;
		board.add(eighteen, c);
		c.gridx = 7;
		c.gridy = 2;
		board.add(nineteen, c);
		c.gridy = 1;
		board.add(twenty, c);
		c.gridy = 0;
		board.add(twentyOne, c);
		c.gridx = 8;
		c.gridy = 2;
		board.add(twentyTwo, c);
		c.gridy = 1;
		board.add(twentyThree, c);
		c.gridy = 0;
		board.add(twentyFour, c);
		c.gridx = 9;
		c.gridy = 2;
		board.add(twentyFive, c);
		c.gridy = 1;
		board.add(twentySix, c);
		c.gridy = 0;
		board.add(twentySeven, c);
		c.gridx = 10;
		c.gridy = 2;
		board.add(twentyEight, c);
		c.gridy = 1;
		board.add(twentyNine, c);
		c.gridy = 0;
		board.add(thirty, c);
		c.gridx = 11;
		c.gridy = 2;
		board.add(thirtyOne, c);
		c.gridy = 1;
		board.add(thirtyTwo, c);
		c.gridy = 0;
		board.add(thirtyThree, c);
		c.gridx = 12;
		c.gridy = 2;
		board.add(thirtyFour, c);
		c.gridy = 1;
		board.add(thirtyFive, c);
		c.gridy = 0;
		board.add(thirtySix, c);
		
		//black and red buttons
		c.gridx = 4;
		c.gridy = 3;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		board.add(black, c);
		c.gridx= 7;
		board.add(red, c);
		
		//bet amount
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		board.add(betAmount, c);
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
