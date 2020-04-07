



public class excepton2{

	public static void main(String[]args)
	{
		try{
		int arr[]=new int[5];
		arr[5]=10;
		System.out.println("arr[1] value is :"+arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("u put wrong index");
		}
	}

}
