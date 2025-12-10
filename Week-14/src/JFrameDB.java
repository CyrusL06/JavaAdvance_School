import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class JFrameDB extends JFrame {
	JPanel topPanel=new JPanel(); //INtroducce Two panel TOP
	JPanel mainPanel=new JPanel(); //Bottom Panel
	JPanel controlPanel=new JPanel();
	JLabel myLabel = new JLabel("Query: ");
	JTextField myText=new JTextField(30);
	//JTextFIeld is weird with fieldText
	//We have to add ListModel to handle elements
	DefaultListModel<String> model = new DefaultListModel<>(); 
	//
    JList<String> myList = new JList<>(model);
	
	public JFrameDB()
	{
		
		super("Coffee Order");  //Extens JFrame which is the title
		final int WIDTH = 500;
		final int HEIGHT = 400;
		
		
		// addActionListener for TextField
								//lundam expression anonymouse class
								//implementing actionListener
		myText.addActionListener(e -> {
			//To check if query ccorrect
		    JOptionPane.showMessageDialog(null, myText.getText());
		    try
		    {
		    	//1.Build COnnection
		    	 final String DB_URL = "jdbc:derby:CoffeeDB";
		      
		    	//2.  Create a connection to the database.
		         Connection conn = DriverManager.getConnection(DB_URL);
		         
		         //3.  Create a Statement object.
		         Statement stmt = conn.createStatement();
		         
		         //4. Create a string with a SELECT statement.
		         String sqlStatement = myText.getText();
		            //"SELECT * FROM Coffee Where Price>=10";
		         
		         //5. Send the statement to the DBMS.
		         ResultSet result = stmt.executeQuery(sqlStatement);
		         
		         //6. Display a header for the listing.
		         System.out.println("Coffees costing more than $10.00");
		         System.out.println("--------------------------------");
		         
		         // Display the contents of the result set.
		         // The result set will have three columns.
		         while (result.next())
		         {
		        	 String tmp;
		        	 String Description=result.getString("Description").toString();
		        	 Description = Description.format("%-30s",Description).substring(0,30);
		        	 
		        	 tmp=Description;
		        	 
		        	 String ProdNum=result.getString("ProdNum").toString();
		        	 ProdNum = ProdNum.format("%-15s",ProdNum).substring(0,10);
		        	 tmp = tmp + ProdNum;
		        	 
		        	 String Price=result.getString("Price").toString();
		        	 Price = Price.format("%-15s",Price).substring(0,6);
		        	 tmp = tmp + Price;
		        	 System.out.println(tmp);
		        	 model.addElement(tmp);
		         }
		         
		         // Close the connection.
		         conn.close();
		      }
		      catch(Exception ex)
		      {
		         System.out.println("ERROR: " + ex.getMessage());
		      }
		    
		   
		    myText.setText("");
		     
		    
		});
		 
		
        topPanel.setLayout(new FlowLayout());
        mainPanel.setLayout(new FlowLayout());
        controlPanel.setLayout(new FlowLayout());
        
        topPanel.add(myLabel);
        topPanel.add(myText);
        
        myList.setFixedCellWidth(480);  
        myList.setFixedCellHeight(35); //height is not measured by pixel
        //it used how many rows we have added in here 
        myList.setFont(new Font("Monospaced", Font.PLAIN, 14));
        //We need to change font same length to  align them
        //WHY? because the difference in letter when java generate GUI have different ways to show it
        mainPanel.add(new JScrollPane(myList),BorderLayout.CENTER);
        
        this.add(topPanel, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
       // this.add(controlPanel,BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aFrame.setLayout(new FlowLayout());

		JFrameDB myFrame=new JFrameDB();
		
		
		
		
	}

}
