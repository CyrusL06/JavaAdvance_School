package JFrameInterfaceDemo;

import javax.swing.JFrame;
import javax.swing.*;



public class JFrameDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		JFrame myFrame = new JFrame("Hello World");
		final int WIDTH = 300;
		final int HEIGHT = 200;
		
		myFrame.setSize(WIDTH,HEIGHT);

		//Form is not visible thus change that
		myFrame.setVisible(true);
		//When 
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JFrame anotherFrame = new JFrameWComponents("Decond", "This is another frame", 10 , 100, 500);
		
		
	}


}
