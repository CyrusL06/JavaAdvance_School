package Four_ComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JComboBoxDemo extends JFrame implements ItemListener, ActionListener {

//	Interface needed!!
	JLabel label1, label2;
	JComboBox myComboBox;
	JButton myButton;

	
	public JComboBoxDemo()
	{
		super("JComboBox Demo");
		myButton = new JButton("Test");
		this.setLayout( new FlowLayout() );
		String[] cities = {"Van", "BV", "NW", "Coquit"};
		myComboBox = new JComboBox(cities);
		myComboBox.addItemListener(this);
		
		
		label1 = new JLabel("cityL: ");
		label2 = new JLabel("  ");
		
		myButton.addItemListener(this); 
		myButton.addActionListener(this);
		
		this.add(myButton);
		
		this.add(myComboBox);
		this.add(label1);
		this.add(label2);
		
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JComboBoxDemo myFrame = new JComboBoxDemo();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		label2.setText("Hello");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label2.setText("Bye");
		
	}

}
