import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	final static int HEIGHT =600;
	final static int WIDTH =600;

	
	
	public static void ShowNullLayout()
	{
		final int B_W = 60;
		final int B_H = 40;
		
		JFrame myFrame = new JFrame("null layout Demo");
		
		JButton[] myButtons = new JButton[5];
		myFrame.setLayout(null);
		
		for (int i=0; i < myButtons.length; i++)
		{
			myButtons[i] = new JButton("Buttonn" + i);
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			myButtons[i].setBounds(null);
		}
		
		myFrame.setSize(HEIGHT, WIDTH);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		
	}
	

	//Centered Adjustment Perfectly...
	
	public static void ShowFlowLayout()
	{
		final int B_W = 60;
		final int B_H = 40;
		
		JFrame myFrame = new JFrame("Flow layout Demo");
		
		JButton[] myButtons = new JButton[5];
		myFrame.setLayout(new FlowLayout());
		
		for (int i=0; i < myButtons.length; i++)
		{
			myButtons[i] = new JButton("Buttonn" + i);
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			
			myFrame.add(myButtons[i]);
		}
		
		myFrame.setSize(HEIGHT, WIDTH);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	
	
	public static void showBorderLayout() 
	{
		final int B_W = 80;
		final int B_H = 40;
		
		JFrame myFrame = new JFrame("SHow Border layout Demo");
		JPanel myPanel = new JPanel();
		myPanel.setLayout(null);
		
		
		JButton[] myButtons = new JButton[6];
		//This changed
		myFrame.setLayout(new BorderLayout());
		//What is panel?
		
		for (int i=0; i < myButtons.length; i++)
		{
			myButtons[i] = new JButton("Buttonn" + i);
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			
			
		}
		
		myButtons[2].setBounds(100,100,100,50);
		myButtons[5].setBounds(100,210,100,50);
		
		myPanel.add(myButtons[2]);
		myPanel.add(myButtons[5]);

		

		
		myFrame.add(myButtons[0],BorderLayout.PAGE_START);
		myFrame.add(myButtons[1],BorderLayout.LINE_START);
		//PANEL ISED
		myFrame.add(myPanel,BorderLayout.CENTER);
		
//		myFrame.add(myButtons[2],BorderLayout.CENTER);
		myFrame.add(myButtons[3],BorderLayout.LINE_END);
		myFrame.add(myButtons[4],BorderLayout.SOUTH);

		
		
		
		myFrame.setSize(HEIGHT, WIDTH);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		
	}
	

	public static void boxLayout()
	{
		//COPY
		final int B_W = 80;
		final int B_H = 40;
		JFrame myFrame = new JFrame("Box layout Demo");
		
		JPanel myPanel = new JPanel();
		
		JButton[] myButtons = new JButton[6];
		//This changed
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		//What is panel?
		//---------
		
		
		for (int i=0; i < myButtons.length; i++)
		{
			myButtons[i] = new JButton("Buttonn" + i);
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			myFrame.add(myButtons[i]);
		}
			
		myFrame.add(myPanel);
		myFrame.setSize(200,200);
		myFrame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ShowNullLayout();
		ShowFlowLayout();
		showBorderLayout();
		boxLayout();
		boxLayout();
	}
	

}
