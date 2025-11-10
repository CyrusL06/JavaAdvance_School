
public class EnumDemo_4 {

	//Special data type that defines set of names constants
	enum Day {
		Mon,Tue,Wed,Thur,Fri,Sat,Sun
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today = Day.Mon;
		System.out.println(today);
		
		for (Day d: Day.values())
		{
			System.out.println(d);
		}
		
	}

}
