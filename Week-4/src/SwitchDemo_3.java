
public class SwitchDemo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We want to display case 1 we need to put break in the thus not shwoing others
//		Therefore we use break
		
		int num = 1;
		char mychar = 'C';
		
		switch(num)
		{
			case 1:
				System.out.println("Case 1");
				break;
		
			case 2:
				System.out.println("Case 2");
				break;

			case 3:
				System.out.println("Case 3");
				break;
				
			default:
				System.out.println("Default");
				break;
				
		}
		
		switch(mychar)
		{
			case 'C':
				System.out.println("Case C");
				break;
		
			case 'B':
				System.out.println("Case B");
				break;

			case 'A':
				System.out.println("Case A");
				break;
				
			default:
				System.out.println("Default");
				break;
				
		}
		
		String str1 = "Hello";
		String str2 = "Hello World";
		String str3 = str1 + "World";

		if(str2 == str3) //?? We compare the reference instead of the contents
		{
			System.out.println("");
		}
		
	}

}
