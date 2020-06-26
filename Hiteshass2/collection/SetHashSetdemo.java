package practice;
import java.util.*;
public class SetHashSetdemo {
	public static void main(String[]args)
	{
		Set <Integer>s=new HashSet<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			s.add(sc.nextInt());
		}
		System.out.println(s);

		System.out.println("using foreach");
		for(int y:s)
		{
			System.out.println(y);
		}
		System.out.println("using iterator");
		Iterator<Integer>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
