package Interface;

public class Dog extends animal implements Work, Rescue 
{

	@Override
	public void Move()
	{
		// TODO Auto-generated method stub
		System.out.println("Im running");

	}
	
	
	@Override
	public void Searching(int hr) {
		// TODO Auto-generated method stub
		System.out.println("I can work more than" + MAX + "hrs to search although Im tired");

	}

	@Override
	public void DoingWork(int hr) {
		// TODO Auto-generated method stub
		if(hr>MAX)
			System.out.println("Im sorry Im only working set amount");
		else
			System.out.println("Im working no petting");

	}


	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("Im on break");

		
	}
	
	
	
	
}
