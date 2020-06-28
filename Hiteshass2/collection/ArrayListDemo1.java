package practice;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[]args)
	{
		List <String> l=new ArrayList<>();
		System.out.println("Add value in obj array using Scanner");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<=5;i++)
		{
			l.add(sc.next());
		}

		System.out.println("Itertation using for loop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

		System.out.println("Itertation using foreachloop");
		for(String arr:l)
		{
			System.out.println(arr);
		}

		System.out.println("Itertation using iterator");
		Iterator<String>i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}


	}
}
