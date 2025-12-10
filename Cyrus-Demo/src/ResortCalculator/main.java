package ResortCalculator;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class main extends JFrame implements ItemListener
{
	final int BASE_PRICE = 200;
	final int WEEKEND_PREMIUM = 100;
	final int BREAKFAST_PREMIUM = 20;
	final int GOLF_PREMIUM = 75;
	int totalPrice = BASE_PRICE;
	
	final int WIDTH = 280;
	final int HEIGHT = 300;
	
	JLabel resortLabel = new JLabel("Resort Price Calculator");
	JLabel priceLabel = new JLabel("The Price of Your Stay is: $");
	
	JTextField finalPrice = new JTextField(4);

	JLabel optionExplainLabel = new JLabel("Base Price Calculator");
	JLabel optionExplainLabel2 = new JLabel("Check Options if you want:");

	
	JCheckBox weekendbox = new JCheckBox("Weekend Premium $:" + WEEKEND_PREMIUM, false);
	JCheckBox breakfastBox = new JCheckBox("Breakfast Premium $:" + BREAKFAST_PREMIUM, false);
	JCheckBox golfbox = new JCheckBox("Golf Premium $:" + GOLF_PREMIUM, false);

	
	public main()
	{
		super ("Reosrt Calculator");
		
		setLayout(new FlowLayout());
		add(resortLabel);
		add(optionExplainLabel);
		add(optionExplainLabel2);
		
		add(weekendbox);
		add(breakfastBox);
		add(golfbox);
		
		add(priceLabel);
		add(finalPrice);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.setSize(WIDTH,HEIGHT);
		
		weekendbox.addItemListener(this);
		breakfastBox.addItemListener(this);
		golfbox.addItemListener(this);
		finalPrice.setText("$" + totalPrice);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main myFrame = new main();
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		// TODO Auto-generated method stub
		Object source = e.getSource();	
		int select = e.getStateChange();
		
			if (source == weekendbox)
				if(select == ItemEvent.SELECTED)
					totalPrice += WEEKEND_PREMIUM;
			else if( source == breakfastBox)
				if(select == ItemEvent.SELECTED)
					totalPrice += BREAKFAST_PREMIUM;
			else if (source == golfbox);
				if(select == ItemEvent.SELECTED);
					totalPrice += GOLF_PREMIUM;
		
			finalPrice.setText("$"+ totalPrice);
	}
	

}
