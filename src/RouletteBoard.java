import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RouletteBoard extends JApplet implements ActionListener
{
	private JButton one, two, three, four, five, six, seven,
		eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, 
		sixteen, seventeen, eighteen, nineteen, twenty, twentyOne,
		twentyTwo, twentyThree, twentyFour, twentyFive, twentySix,
		twentySeven, twentyEight, twentyNine, thirty, thirtyOne, 
		thirtyTwo, thirtyThree, thirtyFour, thirtyFive, thirtySix,
		black, red, firstThird, secondThird, thirdThird, firstColumn, 
		secondColumn, thirdColumn, odd, even;
	private JTextField betAmount;
	private JTextArea guiBankroll;
	
	public void init()
	{
		SimpleRouletteBets master = new SimpleRouletteBets();
		
		Container board = getContentPane();
		board.setBackground(Color.GREEN);
		
		guiBankroll = new JTextArea("Current Bankroll: $" + master.getBankroll());
		
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
		four = new JButton ("4");
		four.addActionListener(this);
		five = new JButton ("5");
		five.addActionListener(this);
		six = new JButton ("6");
		six.addActionListener(this);
		seven = new JButton ("7");
		seven.addActionListener(this);
		eight = new JButton ("8");
		eight.addActionListener(this);
		nine = new JButton ("9");
		nine.addActionListener(this);
		ten = new JButton ("10");
		ten.addActionListener(this);
		eleven = new JButton ("11");
		eleven.addActionListener(this);
		twelve = new JButton ("12");
		twelve.addActionListener(this);
		thirteen = new JButton ("13");
		thirteen.addActionListener(this);
		fourteen = new JButton ("14");
		fourteen.addActionListener(this);
		fifteen = new JButton ("15");
		fifteen.addActionListener(this);
		sixteen = new JButton ("16");
		sixteen.addActionListener(this);
		seventeen = new JButton ("17");
		seventeen.addActionListener(this);
		eighteen = new JButton ("18");
		eighteen.addActionListener(this);
		nineteen = new JButton ("19");
		nineteen.addActionListener(this);
		twenty = new JButton ("20");
		twenty.addActionListener(this);
		twentyOne = new JButton ("21");
		twentyOne.addActionListener(this);
		twentyTwo = new JButton ("22");
		twentyTwo.addActionListener(this);
		twentyThree = new JButton ("23");
		twentyThree.addActionListener(this);
		twentyFour = new JButton ("24");
		twentyFour.addActionListener(this);
		twentyFive = new JButton ("25");
		twentyFive.addActionListener(this);
		twentySix = new JButton ("26");
		twentySix.addActionListener(this);
		twentySeven = new JButton ("27");
		twentySeven.addActionListener(this);
		twentyEight = new JButton ("28");
		twentyEight.addActionListener(this);
		twentyNine = new JButton ("29");
		twentyNine.addActionListener(this);
		thirty = new JButton ("30");
		thirty.addActionListener(this);
		thirtyOne = new JButton ("31");
		thirtyOne.addActionListener(this);
		thirtyTwo = new JButton ("32");
		thirtyTwo.addActionListener(this);
		thirtyThree = new JButton ("33");
		thirtyThree.addActionListener(this);
		thirtyFour = new JButton ("34");
		thirtyFour.addActionListener(this);
		thirtyFive = new JButton ("35");
		thirtyFive.addActionListener(this);
		thirtySix = new JButton ("36");
		thirtySix.addActionListener(this);
		
		board.setLayout(new GridLayout());
		board.add(one);
		board.add(two);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
