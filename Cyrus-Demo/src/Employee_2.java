
//With this code it allosw the object to be sorted
public class Employee_2 implements Comparable <Employee_2>
{
	private int empNum;
	private double payRate;
	
	
	public void setEmpNum (int num)
	{
		empNum = num;
	}
	
	
	public void setPayRate(double rate) 
	{
		payRate = rate;
	}
	
	public int getEmptNum()
	{
		return empNum;
	}
	
	public double payRate()
	{
		return payRate;
	}
	
	
	@Override
//Logic of comparison	
	public int compareTo (Employee_2 emp)
	{
		int result;
			//if the object emplNum is =
			if (empNum == emp.empNum)
				result = 0;
			else if (empNum > emp.empNum)
				result = 1;
			else
				result = -1;
		return result;
//		return ("#" + empNum + " pay rate $ " + payRate);
		
	}
	
	// Inside the Employee_2 class...

	@Override
	public String toString() { // Complete the correct signature
	    return ("#" + empNum + " pay rate $ " + payRate);
	}
}
