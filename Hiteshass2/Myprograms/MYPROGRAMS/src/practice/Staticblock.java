package practice;
class ano{
static {
	System.out.println("my name is khan Static block");
}
{
	System.out.println("annonymus block call");
}
}
public class Staticblock {
	static {
		System.out.println(" Static block 2");
	}
		
		public static void main(String[]args)
		{
			ano a=new ano();
		}

}
