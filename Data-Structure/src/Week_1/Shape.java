package Week_1;

public abstract class Shape {
	
	private String color;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Shape(String color) {
		super();
		this.color = color;
	}

	
	public abstract void printOnPaper(); //method with no return
	//child implements it~
	
	
	//Getter Setter
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

	

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
