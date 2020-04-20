package practice;
import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[]args)
	{
		List <Integer> l=new ArrayList<>();
		System.out.println("Add value in obj array using Scanner");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<=5;i++)
		{
			l.add(sc.nextInt());
		}
			System.out.println(l);
		System.out.println("Add Succesfully");

		System.out.println("Itertation using for loop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

		System.out.println("Itertation using foreach loop");
		for(int a:l)
		{
			System.out.println(a);
		}
		System.out.println("Itertation using for loop");
		Iterator<Integer>i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i);
		}

	}
}
