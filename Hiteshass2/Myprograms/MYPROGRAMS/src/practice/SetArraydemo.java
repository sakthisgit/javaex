package practice;
import java.util.*;
public class SetArraydemo {
	public static void main(String[]args)
	{
		SortedSet<Integer>s=new TreeSet<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			s.add(sc.nextInt());
		}
		System.out.println(s);
		s.headSet(5);
		s.tailSet(65);
		System.out.println(s);

		System.out.println("iteration using forloop not done bcoz index not follow set");
		System.out.println("using foreach");
		for(int e:s)
		{
			System.out.println(e);
		}
		System.out.println("using iteration");
		Iterator<Integer>o=s.iterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
	}
}
