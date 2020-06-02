package practice;
class Annonymous{
	int id;
	String msg; 
	{
		System.out.println("First Annonymous block");
		int id=1;
		//String msg;
		System.out.println("id is :"+id);
		System.out.println("msg is:"+msg);
	}
	{
		System.out.println("Second Annonymous block");
		//int id;
		String msg="hi";
		System.out.println("id is :"+id);
		System.out.println("msg is:"+msg);
	}
	Annonymous()
	{
		System.out.println("call constructor");
	}
}
public class Annonymusdemo2 {
	public static void main(String[]args)
	{
	Annonymous a=new Annonymous();
	}
}
