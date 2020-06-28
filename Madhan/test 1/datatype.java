import java.util.*;
class datatype
{
	public static void main(String []args)
	{	
		int count;
		long negnum=-9223372036854775808L;
		long posnum=9223372036854775807L;
		System.out.print("Enter count : ");
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		long []numbers=new long[count];
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter number "+(i+1)+" : ");
			numbers[i]=sc.nextLong();
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(numbers[i]+"  can be fitted in these Data types: ");
			if(numbers[i]<=-128||numbers[i]<=127)
			{
				System.out.println("Byte");
			}
			if(numbers[i]<=-32768||numbers[i]<=32767)
			{
				System.out.println("Short");
			}
			if(numbers[i]<=-2147483648||numbers[i]<=2147483647)
			{
				System.out.println("Integer");
			}
			if(numbers[i]<=negnum||numbers[i]<=posnum)
			{
				System.out.println("Long");
			}
			else
			{
				System.out.println("number type can't identify");
			}
		}
	}
}
