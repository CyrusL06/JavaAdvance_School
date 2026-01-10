package Week_1;

public class Car {
	//Data
	private String carMake;
	private int year;
	private double price;

	

	//Method
	/* constructor */
	
	public Car() {
		super();
	}
	
	
	public Car(String carMake, int year, double price) {
		super();
		this.carMake = carMake;
		this.year = year;
		this.price = price;
	}
	/*Getters and Setters*/
	
	public String getCarMake() {
		return carMake;
	}
	
	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}



	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}



	public void setYear(int year) {
		this.year = year;
	}


	/*Other Methods*/
	@Override
	public String toString() {
		return "Car [carMake= " + carMake + ", year= " + year + ", price= " + price + "]";
	}


	public void setPrice(double price) {
		this.price = price;
	}

	


}
