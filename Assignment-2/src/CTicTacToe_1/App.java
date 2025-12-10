package CTicTacToe_1;

import javax.swing.UIManager;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

      
        
        TicTacToe tictactoe = new TicTacToe();
	}

}
