package practice;

public class Staticvar {
	final int id=1;
	static final String name ="hitesh";
	static final String batchcode="ct_106";
	
	public static void main(String[]args)
	{
		Staticvar s=new Staticvar();
		System.out.println("id is : "+s.id);
		System.out.println("name is : "+Staticvar.name);
		System.out.println("batchcode is :" +Staticvar.batchcode);
	}
}
