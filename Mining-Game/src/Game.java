import java.util.*;

public class Game {
	public static void PrepareGame(Diamond[]  diamonds, int size)
	{
		int x, y , value, depth;
		Random rnd = new Random();
		for(int i=0;i<diamonds.length;i++)
		{
			x = rnd.nextInt(size);
			y = rnd.nextInt(size);
			value = rnd.nextInt(100)+1;
			depth = rnd.nextInt(10);
			diamonds[i] = new Diamond(x, y, value, depth);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		Investor player = new Investor("ABC", 20);
		Diamond[]  diamonds = new Diamond[size*size/4];
		PrepareGame(diamonds,size);
		JFrameMap myFrame = new JFrameMap(size,player,diamonds);
		
		
		
		
		
	}

}

