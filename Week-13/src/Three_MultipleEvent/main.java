//You need this
package Three_MultipleEvent;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;


public class main extends JFrame implements ActionListener {

	
	public  static final int W = 300;
	public  static final int H = 600;

	
	JButton btn1 =new JButton("Button1");
	JButton btn2 = new JButton("Button2");
	//label
	JLabel myLabel = new JLabel("start");

	public main()
	{
		super("JAction Multiple");
		this.setLayout(new FlowLayout());
		this.add(btn1);
		add(btn2);
		this.add(myLabel);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		this.setSize(W,H);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//ActionListener
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		myLabel.setText("CLicked");
		
		//All the class derived from object everything can be treated in java
		Object source = e.getSource();
		String msg = ((JButton)(source)).getText();

		
		if(source==btn1)
		{
			myLabel.setText("Button1 Clicked");
		}
		
		if(source==btn2)
		{
			myLabel.setText("Button2 Clicked");
		}
		
		
		
	}

	
	//Main Master
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		main myFrame = new main();
	}

}
