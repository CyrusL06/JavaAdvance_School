package Interface;

public abstract class animal 
{
	public String name;
	public int size;
	
	public abstract void Move();
	
	
	
	public void SayHello()
	{
		System.out.println("Hello Everyone, I am " + name);
	}
}
