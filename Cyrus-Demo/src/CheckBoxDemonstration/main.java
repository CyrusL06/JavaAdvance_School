package CheckBoxDemonstration;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class main extends JFrame implements ItemListener
{

	JLabel myLabel = new JLabel("What would you like to drink?");
	String [] choices = {"Coffee", "Cola", "Milk", "Water"};
	
	JCheckBox Coffee = new JCheckBox("Coffee", false);
	JCheckBox Cola = new JCheckBox("Cola", false);
	JCheckBox Milk = new JCheckBox("Milk", false);
	JCheckBox Water = new JCheckBox("Water", false);
	
	

	
	public main()
	{
		
		super("CheclBox Demon");
		setLayout(new FlowLayout());
		
		Coffee.addItemListener(this);
		Cola.addItemListener(this);
		Milk.addItemListener(this);
		Water.addItemListener(this);
		
		add(myLabel);
		add(Coffee);
		add(Cola);
		add(Milk);
		add(Water);

		
		
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		main frame = new main();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
