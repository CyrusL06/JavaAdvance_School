package CTicTacToe_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TicTacToe 
{

	//Need to add this to fix the UI buttons Because Im in macbook
	 public static void main(String[] args) {

	      // FIX FOR macOS BUTTON COLORS
		 try {
	            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        new TicTacToe();
	    }
	
	
	
	int boardWidth = 600;
	int boardHeight = 650; //50px for the text panel on top
	int size = 3;
	
	JFrame frame = new JFrame("Tic-Tac-Toe");
	JLabel label = new JLabel();
	JPanel textPanel = new JPanel();
	JPanel boardPanel = new JPanel();
	JPanel newGame = new JPanel();
	JButton buttonNewGame = new JButton();

	
	//To keep track of the button
	JButton[][] board= new JButton[size][size];
	String playerX = "1";
	String playerO = "O";
	String currentPLayer = playerX;
	
	boolean gameOver = false; //To validate tictac toe
	
	public TicTacToe()
	{
		
		
		frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		
		
//		label.setBackground(Color.black);
		label.setForeground(Color.black);
		label.setFont(new Font("Arial", Font.BOLD,50));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("Tic-Tac-Toe");
		label.setOpaque(true);
		
		textPanel.setLayout(new BorderLayout());
		textPanel.add(label);
		frame.add(textPanel, BorderLayout.NORTH); //Makes the textPanel on top true north
		
		// Setup the New Game button
		buttonNewGame.setText("New Game");
		buttonNewGame.setFont(new Font("Arial", Font.BOLD, 20));
		buttonNewGame.setFocusable(false);
		buttonNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});
		
		newGame.setLayout(new BorderLayout());
		newGame.add(buttonNewGame);
		frame.add(newGame, BorderLayout.SOUTH);
		
		//Add the bottom pannel
		boardPanel.setLayout(new GridLayout(3,3));
//		boardPanel.setBackground(Color.black);
		frame.add(boardPanel);
		
		//Add button for loop
		for(int i = 0; i < size; i ++)
		{
			for(int j = 0; j < size; j++)
			{
				JButton tile = new JButton();
				board[i][j] = tile;
				boardPanel.add(tile);

//				tile.setBackground(Color.black);
//				tile.setForeground(Color.white);
				tile.setFont(new Font("Arial", Font.BOLD,120));
				tile.setFocusable(false);

				//Test
//				tile.setText(currentPLayer);
				tile.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						
						if (gameOver) return;
						
						
						JButton tile = (JButton)e.getSource(); //error because it can come to diff resource
						
						
						if (tile.getText().equals("")) //Only Allows empty spots
						{
							tile.setText(currentPLayer);
							
							checkWinner();
							if (!gameOver) 
							{
								//Alternate Player
								//current player ternary expression() if player = x then set o  otherwise x
								currentPLayer = currentPLayer.equals(playerX) ? playerO : playerX;
								label.setText(currentPLayer + " 's turn" );
							}
						}
					}
				});
			}
		}
	}
	
	// Add this method to reset the game
	void resetGame()
	{
		// Reset all tiles
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				board[i][j].setText("");
				board[i][j].setBackground(null);
			}
		}
		
		// Reset game state
		currentPLayer = playerX;
		gameOver = false;
		label.setText("Tic-Tac-Toe");
	}
	
	void checkWinner()
	{
		horizontalCheck();
		verticalCheck();
		diagonalCheck();
		diagonalCheckOtherSide();
	}
	
	//-----------
		
	void setWinner()
	{
		JOptionPane.showMessageDialog(null, "Winner " + currentPLayer);

	}
		
	
	
	void horizontalCheck() 
	{
		for(int i = 0; i < size; i ++)
		{
			if(board[i][0].getText().equals("")) continue;
			
			if(board[i][0].getText().equals(board[i][1].getText()) &&
			   board[i][1].getText().equals(board[i][2].getText()))
			{
				
				setWinner();
				
				label.setText(currentPLayer + " Is the winner!");
				gameOver = true;
				return;
			}
		}
	}
	
	void verticalCheck()
	{
		for(int i = 0; i < size; i ++)
		{
			if(board[0][i].getText().equals("")) continue;
			
			if(board[0][i].getText().equals(board[1][i].getText()) &&
			   board[1][i].getText().equals(board[2][i].getText()))
			{
				
				setWinner();
				
				label.setText(currentPLayer + " Is the winner!");
				gameOver = true;
				return;
			}
		}
	}
	
	
	void diagonalCheck()
	{
		if(board[0][0].getText().equals("")) return;
		
		if(board[0][0].getText().equals(board[1][1].getText()) &&
		   board[1][1].getText().equals(board[2][2].getText()))
		{
			
			setWinner();
			
			
			label.setText(currentPLayer + " Is the winner!");
			gameOver = true;
		}
	}
	
	void diagonalCheckOtherSide()
	{
		if(board[0][2].getText().equals("")) return;
		
		if(board[0][2].getText().equals(board[1][1].getText()) &&
		   board[1][1].getText().equals(board[2][0].getText()))
		{
			
			setWinner();
		
			
			label.setText(currentPLayer + " Is the winner!");
			gameOver = true;
		}
	}
}