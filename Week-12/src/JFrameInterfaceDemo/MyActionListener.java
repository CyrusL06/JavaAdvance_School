package JFrameInterfaceDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyActionListener implements ActionListener 
{

	public JLabel myLabel;
	int numClicked = 0;
	
	public MyActionListener(JLabel myLabel)
	{
		this.myLabel = myLabel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
