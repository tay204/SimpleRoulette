package roulette;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Storage
{
	SimpleRouletteBets namer = new SimpleRouletteBets();
    RouletteWrite p=new RouletteWrite();
//    public static void main(String args[])
//    {
//        Storage s=new Storage();
//        for(int i=0;i<1;i++)
//            s.start("ID"+i);
//         
//        System.out.print("Done");
//    }
    public void start()
    {
//        p.setId(id);
//        p.setName(namer.playerName);
    	
        try
        {
        	FileWriter fw=new FileWriter("out.txt",true);
        	BufferedWriter bw=new BufferedWriter(fw);
        	bw.write(p.msg());
        	bw.newLine();
        	bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error"+e.getMessage());
        }
        System.out.print("Done");
    }
}