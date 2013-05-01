package roulette;

public class RouletteWrite 


{
	SimpleRouletteBets master1 = new SimpleRouletteBets();
	
	String name = "";
	double bankroll = 0.0;
	
	        
	public String getName()  
	{
	     return master1.playerName;
	}
	public void setName(String name)
	{
	     this.name = name;
	}
	public void setBankroll(double bankroll)
	{
		this.bankroll = bankroll;
	}
	
	public String msg()
	{
	     return this.name+"  "+this.bankroll;
	}
	    

}
