package firstprj;
// creating own exceptions
public class exception2 extends Exception

{
	private static int accno[]= {1001,1002,1003,1004};
	private static String name[]= {"prad","deep","Raj","m"};
	private static double bal[]= {1200,1345,950,1200};
	exception2()
	{
		
	}
	exception2(String str)
	{
		super(str);
	}
	public static void main(String[] args)
	{
		try 
		{
		 for(int i=0;i<accno.length;i++)
		 {
			 System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
		 if(bal[i]<1000)
		 {
			 exception2 me=new exception2("balance is less than 1000");
			 throw me;
		 }
		}
		
     	}
		catch(exception2 e)
		{
			e.printStackTrace();
			
		}

}
}
