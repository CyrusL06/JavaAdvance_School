package Week_1;

public class Student {
	
	//Data
	//Add data encampsualtion
	private String name;
	private int age;
	
	
	//Constructor - method
	//U want people to use it
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Methods
	//Nothing to return
	void displayName(){
		System.out.println("Student name: " + name);
	}
	
	
	
}
