package sealedclass;

public class TestStu {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student[] stus = new Student[2];
		
		stus[0] = new CollegeStu();
		stus[1] = new GraduateStu();
		
		for(Student stu: stus)
		{
			stu.Study();
		}
		
		((CollegeStu)stus[0]).Coop();
		
//		Student asu = new Student();
//		asu.name = "ABC test";
//		asu.ID = 100;
//		
//		System.out.println(asu.name + ", " + asu.ID);
	}

}
