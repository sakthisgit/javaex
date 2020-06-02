package practice;

public class UderdefineEx {

	public void display(int a) throws AgeNotValidException
	{
		if(a<18)
		{
			throw new AgeNotValidException(a);
		}
		else{
			System.out.println("Age is valid");
		}
	}
	public static void main(String[]args)
	{
		UderdefineEx u=new UderdefineEx();
		try {
			u.display(2);
		}
		catch(AgeNotValidException a)
		{
			System.out.println(a);
		}
	}

}
