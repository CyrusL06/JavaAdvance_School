//Diamond
//Investor
//JFRAME
//


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextField;

public class MyAction implements ActionListener{
	public JTextField drillInput;
	public Investor player;
	public Diamond[] diamonds;
	public JButton[][] grids;
	int[][] drilling;
	public int size;

		// We need to get user input along the frame
			//therefore we need constructor to make this. eqials to this. thus can make the ca;cilation
	public MyAction(JTextField drillInput, 
			Investor player,Diamond[] diamonds,JButton[][] grids)
	{
		this.drillInput = drillInput;
		this.player = player;
		this.grids = grids;
		this.diamonds = diamonds;
		drilling = new int[grids.length][grids.length];
	}
	
	public int FindClosest(int xd, int yd)
	{
		int distance = diamonds[0].CalDistance(xd, yd);
		for(int i=0;i<diamonds.length;i++)
		{
			if(diamonds[i].CalDistance(xd, yd)<distance)
			{
				distance = diamonds[i].CalDistance(xd, yd);
			}
		}
		return distance;
	}
	
	public boolean GameStop()
	{
		if(player.balance<1)
		{
			return true;
		}
		boolean hasDiamond = false;
		
		
		for(Diamond d : diamonds)
		{
			hasDiamond = hasDiamond || d.status;
		}
		
		return !hasDiamond;		
	}
	
	public void CheatMode()
	{
		for(int i=0;i<diamonds.length;i++)
		{
			if(!grids[diamonds[i].x][diamonds[i].y].getText().equals("C"))
			{
				grids[diamonds[i].x][diamonds[i].y].setText("T");
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x=0, y = 0;
		int depth =0 ;
		//Check the inecies of the button clicked
		for(int i=0;i<grids.length;i++)	{
			for(int j=0;j<grids[0].length;j++) {
				if(e.getSource()==grids[i][j]){
					x=i; y=j;
				}
			}
		}
		try 
		{
			//parse into int
			depth = Integer.parseInt(drillInput.getText());
			if(depth==999)
			{
				CheatMode();
			}
			if(depth>player.balance)
			{

				JOptionPane.showMessageDialog(null, "You don't have enough fund!");
				return;
			}
			player.balance -= depth;	
			//depth accumulated		
			depth += drilling[x][y];
			drilling[x][y]=depth;
			 
		}
		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null, "Pls input a valid depth");
			return;
		}
		 
		 //handle if user found diamond
		boolean found = false;
		for(int i=0;i<diamonds.length;i++)
		{
			if(diamonds[i].x==x && diamonds[i].y==y && diamonds[i].depth<depth)
			{
				//WIll add the volume
				player.balance += diamonds[i].value;
				//collect
				diamonds[i].Collect();
				JOptionPane.showMessageDialog(null, "Congrats! You found "+diamonds[i].toString()+
						"\n"+"Your balance is " + player.balance);
				grids[x][y].setText("C");
				//set as true
				found = true;
			}
		}
			//if false
		if(found==false)
		{
			JOptionPane.showMessageDialog(null, "Whoops! You missed and the closest distance is "
					+FindClosest(x,y)+ "\nYour balance is " + player.balance);
			 
			 //set at certain grade
			grids[x][y].setText(String.format("%d", depth));
			 
		}
		
		if(GameStop())
		{
			JOptionPane.showMessageDialog(null, "Game Over!");
			System.exit(0);
		}
		 
	}

}
