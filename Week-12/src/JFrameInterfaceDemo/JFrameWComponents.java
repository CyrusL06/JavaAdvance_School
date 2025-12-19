package JFrameInterfaceDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JFrameWComponents extends JFrame  implements ActionListener
{
	
	JLabel myLabel ;
	JButton myButton;
	int numClicked;
	//add components in the Jfram

	public  JFrameWComponents(String title, String msg, int num ,  int w, int h)
	{
		super(title);
		myLabel = new JLabel(msg);
		myButton = new JButton("Button" + num);
		
		//	We need to add this	
		myButton.addActionListener(this);
		//OR
		myButton.addActionListener(this);

		
		numClicked = 0;
		
		//Swing => use building layout 
		this.setLayout(new FlowLayout());
		this.add(myLabel);
		this.add(myButton);
		
		this.setSize(w,h);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		myLabel.setText("You Clicked the Button: " + numClicked);
		numClicked++;
		
	}
}
