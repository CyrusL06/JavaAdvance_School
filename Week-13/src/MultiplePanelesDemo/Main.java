package MultiplePanelesDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public final static int H = 600;
	public final static int W = 600;

	public static void GenerateForm()
	{
		
		double [] splitsx = {0, 0.5, 0, 0.5};
		double []splitsy = {0, 0.5  ,0 ,0.5};
		JFrame myFrame = new JFrame("Multiple JPanels");
		JPanel[] panels = new JPanel[4];
		
		
		myFrame.setLayout(null);
		for (int i = 0; i < panels.length; i++)
		{
			//Create panel
			panels[i] = new JPanel();
			//set layout
			panels[i].setLayout(null);
									 //Split it in 4 way
			panels[i].setBounds((int)(splitsx[i]*W) , (int)(splitsy[i]*H),W/2,H/2 );
			
			
			JButton[] myButtons = new JButton[2];
			for (int j =0; j<myButtons.length; j++)
			{
				myButtons[j] = new JButton("Btn"+i+j);
				//position of buttons
				myButtons[j].setBounds(50+70*j,100,60,40);
				panels[i].add(myButtons[j]);

			}
			
			myFrame.add(panels[i]);

			
		}
		myFrame.setSize(H,W);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 GenerateForm();
	}

}
