package practice;

public class TryCatchFinallyDemo {

	public static void main(String[]args)
	{	try {
		int a=10;
		int arr[]=new int[5];
		arr[5]=a;
		System.out.println(arr[4]);
	}
	catch(ArrayIndexOutOfBoundsException c)
	{
		System.out.println(c);
	}
	finally {
		System.out.println("Hitesh sonar");
	}

	}
}
