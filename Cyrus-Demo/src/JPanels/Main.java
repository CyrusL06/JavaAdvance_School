package JPanels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Main extends JFrame {

	//Panels are containers part o
	
	JLabel label = new JLabel();
	JLabel Seclabel = new JLabel();

	ImageIcon icon = new ImageIcon("");
	
	
	
	public Main ()
	{
		super("Panel Tutorial");

		label.setText("Hi");
		Seclabel.setText("Another One");
		label.setVerticalAlignment(JLabel.BOTTOM); //Allignments...
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 75, 75); //In order to move them we need to put layputNull
		
		
		JPanel Redpanel = new JPanel();
		Redpanel.setBackground(Color.red);
						//  x, y , width, height
		Redpanel.setBounds( 0, 0, 250, 250);
		Redpanel.setLayout(null); 	//Set Layouts

		
		JPanel Bluepanel = new JPanel();
		Bluepanel.setBackground(Color.blue);
						//  x, y , width, height
		Bluepanel.setBounds( 250, 0, 250, 250);
		Bluepanel.setLayout(null); 	//Set Layouts

		
		JPanel Greenpanel = new JPanel();
		Greenpanel.setBackground(Color.green);
						//  x, y , width, height
		Greenpanel.setBounds( 0, 250, 500, 250);
		Greenpanel.setLayout(null); 	//Set Layouts
		
		JFrame frame = new JFrame("Tutorial");
		
		//Add the panel
		frame.add(Redpanel);
		frame.add(Bluepanel);
		frame.add(Greenpanel);

		
		//Add to redPanel because panel act as container 
		// thus we can add elements like the Frame
		
		Greenpanel.add(label);
		

		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);


	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	
		Main start = new Main();
		
	}

}
