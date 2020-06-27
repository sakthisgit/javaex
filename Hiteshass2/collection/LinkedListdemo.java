package practice;
import java.util.*;
public class LinkedListdemo {

	public static void main(String[]args)
	{
		List<Integer>l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		for(int k=0;k<5;k++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("iteration using forloop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("iteration using foreach");
		for(int a:l)
		{
			System.out.println(a);
		}
		System.out.println("iteration using Listiterator");
		ListIterator<Integer>o=l.listIterator();
		while(o.hasNext())
		{
			System.out.println(o.next());
		}
		while(o.hasPrevious())
		{
			System.out.println(o.previous());
		}
	}

}
