package Interface;

public interface Work 
{
	
	public int MAX =8 ; //this assign is Final because they are defining interface
	//Interface define is final all the time
	
	public abstract void DoingWork(int hr); //by default this is abstract
	
	public static void SayHello()
	{
		System.out.println("Hello Im working at most" + MAX + " hrs per week");
	}
	
	
	public default void Dummy() //Interface is so abstract only used foe designing purpose
	//default
	{
		
	}
}
