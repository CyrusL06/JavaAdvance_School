import java.awt.*;

import javax.swing.*;
public class JFrameMap extends JFrame {
	public JButton[][] grids;
	public JPanel[] panels;
	//You are abJle to hand in button, jtext field get message, and do event listenier, work on JOption pop up message box
	JTextField inputBox = new JTextField(5);
	JLabel lblTxt = new JLabel("Your balance");
	JLabel lblBalan = new JLabel("     ");
	
	public JFrameMap(int size, Investor player, Diamond[] diamonds)
	{
		//SIZE
		int btnw=50;
		int btnh=25;

		//CUASE WE ASSUMED ITS 2D
		grids = new JButton[size][size];
		panels = new JPanel[size+1];
			//1.1
		MyAction myAct = new MyAction(inputBox,player,diamonds,grids);
		//THE BOX LAYOUT					container we get it and set as box layout
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

		//Loop panel in and panel out
		//make 6 panels
		for(int i=0;i<panels.length-1;i++)
		{
				//make 6 panels
			panels[i] = new JPanel();
			//set as flow layout
			panels[i].setLayout(new FlowLayout());
			//Create the rid row by row
			for(int j=0;j<grids[i].length;j++)
			{
				grids[i][j] = new JButton("*");
				//grids[i][j].setSize(btnw*2, btnh);
				//How big our button
				grids[i][j].setPreferredSize(new Dimension(btnw,btnh));		
					///LOOK Above 1.1 Thsi one
				grids[i][j].addActionListener(myAct);
				panels[i].add(grids[i][j]);
			}
				//We add panel on the frame
			this.add(panels[i]);	
		}

		//Last panel we add:
			//Size of panel is bigger than our grid because we need space for the nput box
		panels[size] = new JPanel();
		panels[size].setLayout(new FlowLayout());
			//ADD input box
		panels[size].add(inputBox);
			//ADD text
		panels[size].add(lblTxt);
			//ADD Label
		panels[size].add(lblBalan);
		
			
		this.add(panels[size]);
		
			//Make button bugger
		this.setSize(size*(btnw+10),(size+1)*btnh*2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
