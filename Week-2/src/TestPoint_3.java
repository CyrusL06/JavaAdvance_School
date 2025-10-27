
public class TestPoint_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shift to try other points
//		1. Understand the question
//		2. Move one point into another

		mypoint pa = new mypoint(1,2);
		System.out.println(pa.toString());
		
		pa.Shift(10, 20);
		System.out.println(pa.toString());

		
// PT.2
// In java you can use object reference 
							//Static
		int manD = mypoint.ManhattanToZero(10,10);
		
		
		
//PT.3
//Solve mathematical equation to make your coding better
		
	mypoint p_b = new mypoint(2,3);

	double distance = pa.CalcDistance(p_b);
	System.out.println(distance);

	}

}


//Static Reference meaning