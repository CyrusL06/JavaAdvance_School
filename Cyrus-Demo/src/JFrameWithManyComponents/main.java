package JFrameWithManyComponents;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main extends JFrame implements ActionListener
{

	final int WIDTH = 300;
	final int HEIGHT = 150;
	
	JLabel heading = new JLabel("This frame has many components");
	JLabel namePrompt = new JLabel("Enter your name:");
	JTextField answer = new JTextField(12);
	JButton button = new JButton("Click to continue");
	
	public main()
	{
		super("Demonstrating many components");
		
		
	
		
		setLayout(new FlowLayout());
		
		add(heading);
		add(namePrompt);
		add(answer);
		add(button);
		
		
		setSize(WIDTH, HEIGHT);
		
		button.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		main frame = new main();
		frame.setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String name = answer.getText();
		String greet = "Hello: " + name;
		namePrompt.setText(greet);
		
	}

}
