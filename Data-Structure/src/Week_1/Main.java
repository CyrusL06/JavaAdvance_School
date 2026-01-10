package Week_1;

/*
 *  code reuse
 */

public class Main { //Test Driver

	//static avoid creating object
	public static void displayShape(Shape shape) {
		System.out.println("Shape Data:" + shape.toString());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Student myStud = new Student("Cyrus",20);
		myStud.displayName();
		
		Car myCar = new Car();
		Car yourCar = new Car("Toyota", 2025, 35000.00);
		
		System.out.print(yourCar.getCarMake());
		System.out.print(yourCar.getYear());
		

		yourCar.setYear(2006);
		System.out.print(yourCar); //From the toString Method inside Car

		/*---------------*/
		/*2.Inheritance Example*/
		/*---------------*/

		Circle circleOne = new Circle();
		System.out.println("Circle Data:" + circleOne);
		
		Circle circleTwo = new Circle(3.0);
		System.out.println("Circle Data2:" + circleTwo);
		displayShape(circleTwo);
		
		Circle circleThree = new Circle( "Black" ,3.0);
		System.out.println("Circle Data3:" + circleThree);

//		Shape myShape = new Shape("Black"); 
		// When abstract insitiated this is not allowed
		//Abstract cannot be used to create object
		//When you want to create a general class make it abstract
		
		/*Polymorphism Example*/
		//Shape and circle
		//parent can take any child
		Shape aShape = new Circle();
		displayShape(circleTwo);
		//While param is Shape we are allowed to use circle from 
		//inheritance due to polymorphism
		
		/*---------------*/
		/*Interface - View DrawInterface*/
		/*---------------*/

		/*Calling the interface abstract class*/
		circleTwo.draw();
		circleTwo.printOnPaper();
		
		
		/*---------------*/
		/*Composition - 
		/*---------------*/
		Circle circleFour = new Circle (2.0, new Point(5.0, 6.0));
		displayShape(circleFour);

		
	}
	
	
	
	
	

}
