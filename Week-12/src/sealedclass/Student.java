package sealedclass;

//You need to seal it here if you need to use non-seal
public sealed abstract class Student permits GraduateStu, CollegeStu
{
	//Seal Class alows only speciic children to be the children
	
	public String name;
	public int ID;
	public abstract void Study();
	
	
	public static void SayHello()
	{
		System.out.print("Hello");
	}
	
	
	
	
}
