package practice;
import java.util.*;
public class ArraylistaddArraylist {

	public static void main(String[]args)
	{
		List<Integer>l=new ArrayList<>();
		ArrayList<Integer>l1=new ArrayList<>();
		System.out.println("Enter the l values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("Enter the l1 values");
		Scanner sc1=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			l1.add(sc.nextInt());
		}
		System.out.println("Add both l and l1 by using add all");
		l.addAll(l1);
		System.out.println(l);

		l.containsAll(l1);
		System.out.println(l);

		l1.retainAll(l);
		System.out.println(l);

		l.removeAll(l1);
		System.out.println(l);
	}
}
