package Week_1;

public class Point {
	
	private double x;
	private double y;
	
	/*Constructor*/
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/*Getters and Setters*/

	public double getX() {
		return x;
	}


	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	

	public void setY(double y) {
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



}
