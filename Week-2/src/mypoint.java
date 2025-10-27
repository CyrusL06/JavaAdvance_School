
public class mypoint {

	public int x;
	public int y;
	
	
	public mypoint(int x , int y) 
	{
		// TODO Auto-generated constructor stub
//		To differentiate them:
		this.x = x;
		this.y = y;
	}
	
		// x = 10 y=10
		// this.x = 1 this.y=2
		//11 12
	public void Shift(int _x, int _y) {
		//this x is till the parameter x
		//but we need the 
		this.x = this.x + x;
		this.y = this.y + y;
		
		
	// Variable masking
		x = x + _x;
		y = y + _y;
		
	}
	
//PT.2
//	Thesis:
//	Conclusion:
	
//	We can use this method before any object is created
	public static int ManhattanToZero(int x, int y)
	{
		return Math.abs(x + y);
	}
	

//	PT.3
// To calculate the distance within the graph

	public double CalcDistance(mypoint another) {
		
		//(x1-x2)^2 + (y1-y2)^2
		double xx = (x-another.x) - (x-another.x);
		double yy = (y-another.x) - (y-another.x);
		
		double d = Math.sqrt(xx + yy);
		
		return d;
		
	}
	
	
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
