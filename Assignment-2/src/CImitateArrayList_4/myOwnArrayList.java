package CImitateArrayList_4;

public class myOwnArrayList 
{
	
	static int size;
	static int capacity = 10;
	 static Object [] array;
	 boolean clear = false;
	
	
	public myOwnArrayList()
	{
		this.array = new Object[capacity];
	}
	
	public myOwnArrayList(int capacity)
	{
		this.array = new Object[capacity];
		
	}
	
	public void add(Object data)
	{
		//1. Data is inserted at the very First Index of Array
		
		
		//ArrayList Behaviour
		//1. Takes in a variable anytype is then accepted
		//2. Increase array size by one 
		//3. Pointer at 1st indeci 
		//4. Done
		
		//COnversion
		//1. Fixed Array is created
		//2. input the param in new array 
		//3. And to increase the 
		
		if (size >= capacity)
			grow();
		
		array[size] = data;
		size++;  //Increase size by one
	
		
		
	}
						//2
	 void remove(Object data)
	{
		 //1.FIrst phase
		for(int i = 0; i < array.length; i++)
		{				//2
			if (i == (int)data )
			{
				
				Object tmp;
//				tmp = array[i+1];
//				array[i+1] = 0;
//				array[i] = tmp;
								//2		//2
				for(int j = (int) data; j < array.length-1; j++ ) 
				{
					tmp = array[i+1]; //grabe 
					array[i] = 0;
					array[i] = tmp; //grabe ;
					
				}
			}
		}
		
		
	}
	 
	 
	 void clear()
	 {
		 clear = true;
		 for(int i = 0; i < array.length; i++)
			{
				array[i] = null;					
			}
		 capacity = 0;
		 
		 
	 }


	 void grow() 
	{
	// TODO Auto-generated method stub
		
	
		Object[] temp = new String[array.length + 1];
		   
		for (int i = 0; i < array.length; i++)
		{
			temp[i] = array[i];
		}
  
		array = temp;
		

	}
		

	 void shrink() 
	{
	// TODO Auto-generated method stub
		
	
		Object[] temp = new String[array.length + 1];
		   
		for (int i = 0; i < array.length; i++)
		{
			temp[i] = array[i];
			
		}
  
		array = temp;
		

	}
		
	
 
	public String toString()
	{
		
		String str = "[ ";
		
		for (int i = 0; i < capacity; i++)
		{
			str +=(array[i] + ",");
		}
		
		 str += " ]";
		 
		return str;
	}
	
	
}
