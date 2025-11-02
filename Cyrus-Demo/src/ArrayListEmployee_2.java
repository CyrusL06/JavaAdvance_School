
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEmployee_2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Employee_2> emps = new ArrayList<Employee_2>();
		Employee_2 e1 = new Employee_2();
		Employee_2 e2 = new Employee_2();
		Employee_2 e3 = new Employee_2();
		Employee_2 e4 = new Employee_2();

		
		e1.setEmpNum(123);
		e1.setPayRate(18.55);
	emps.add(e1);
		
		e2.setEmpNum(531);
		e2.setPayRate(33.15);
	emps.add(e2);

		
		e3.setEmpNum(231);
		e3.setPayRate(33.15);
	emps.add(e3);

		
		e4.setEmpNum(431);
		e4.setPayRate(33.15);
	emps.add(e4);

		System.out.println("Before Sorting");
		display(emps);
		Collections.sort(emps);
		System.out.println("After Sorting");
		display(emps);

	
		
		
		//You need to push it inside the ArrayList to show
		
//			emps.add(e1);
//			display(emps);
//		
//			emps.add(e2);
//			
//			display(emps);
		
		
	}

	private static void display(ArrayList<Employee_2> emps) {
		// TODO Auto-generated method stub
		System.out.println("\nThe size of the list is " + emps.size());
		System.out.println(emps);
	}

}
