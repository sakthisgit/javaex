package practice;
import java.util.*;
public class Setlinkedhashsetdemo {
	public static void main(String[]args)
	{
		Set<Integer>s=new LinkedHashSet<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			s.add(sc.nextInt());
		}
		System.out.println("using for each");
		for(int i:s)
		{
			System.out.println(i);
		}
		System.out.println("using iterator");
		Iterator<Integer>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
