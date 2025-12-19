package sealedclass;

//Why does it need to be final???
//finalizes the seal so you cat further expand it.
public final class CollegeStu extends Student
{

	@Override
	public void Study() {
		// TODO Auto-generated method stub
		System.out.print("This is a college Student");

	}

	public void Coop()
	{
		System.out.print("Im in Co-Op");

	}
	
	
}
