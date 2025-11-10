
public class Student_2 {
	
	public int ID;
	public String name;
	
	public Student_2(int ID, String name)
	{
		ID = ID;
		name = name;
	}
	
	@Override
	public String toString()
	{
		return ("ID: " + ID + "Name: " + name);
	}
}
