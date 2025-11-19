


public class DynamicArray 
{
	int size;
	int capacity = 10;
	Object[] array;
	
	
	public DynamicArray()
	{
		this.array = new Object[capacity];
		
	}
	
	public DynamicArray(int capacity)
	{
		this.array = new Object[capacity];
		
	}
	
	public void add (Object data)
	{
		if (size >= capacity)
			grow();
		
		array[size] = data;
		size++;  //Increase size by one
	}
	
	public void insert (int index, Object data)
	{
		if(size >= capacity)
			grow();
		
		//We want to move the current position to the right
//		for(int i = size; i < index; i--)
//		{
//			
//		}
		
		//0  // "A"
		for (int i = size; i > index; i--)
		{
			array[i] = array[i - 1];
			//array[size] = array[size-1]
			//array[5] = array[5-1]

		}
		array[index] = data;
		//array[]
		size++;
	}
	
	public void delete (Object data)
	{
		
		for(int i = 0; i < size; i++)
		{
			if (array[i] == data)
			{
				for(int j = 0; j < (size - i -j); j++)
				{
					array[i + j] = array[i + j + 1];
				}
				
				array[size-1] = null;
				size--;
				if(size <= (int)(capacity/3))
				{
					shrink();
				}
				
				break;
			}
		}
		
		
	}
	
	public int search (Object data)
	{
		return -1;
	}
	
	
	private void grow()
	{
		
	}
	
	private void shrink()
	{
		
	}
	
	
	public boolean isEmpty()
	{
		return size == 0;
		
	}
	
	public String toString()
	{
		String string = "";
		
		for(int i = 0; i < capacity; i++)
		{
			string +=  array[i] + ", ";
		}
		if (string != "") //to delete the "," at the end
			string = "[" + string.substring(0, string.length() - 2) + "]"; //beginning at index 0 continue until string.length is -2
		else
			string = "[]";
			
		return string;
	}
	
	
}
