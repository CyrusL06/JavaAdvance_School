package Week_1;

//Inheritance
public class Circle extends Shape implements DrawableInterface {
	
	private double radius;
	private Point center = new Point(); //Call out the class to be composed
	//Composition allows you connect with other class without parent-child relationship
	//Primitive Type
	
	//empty
	public Circle() {
		super();
	}
	//Initialza both color and radius
	//How to access parent inheritance
	public Circle( String color, double radius) {
		super(color); //Pass color to pass to parent
		this.radius = radius;
	}
	
	public Circle( double radius) {
		super(); //Pass color to pass to parent
		this.radius = radius;
	}
	
	public Circle( double radius, Point center) {
		super(); //Pass color to pass to parent
		this.radius = radius;
		this.center = center;

	}
	
	//Getter setters
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getColor()=" + getColor() + "Center=" + center + "]";
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Cirlce");
		
	}
	
	@Override
	public void printOnPaper() {
		// TODO Auto-generated method stub
		System.out.println("Printing on Paper");
		
	}


}
