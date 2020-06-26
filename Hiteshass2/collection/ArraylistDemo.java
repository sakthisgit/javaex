package practice;
import java.util.*;
public class ArraylistDemo {
	public static void main(String[]args)
	{
		ArrayList<Integer>a=new ArrayList<>();
		a.add(25);
		a.add(30);
		a.add(98);
		a.add(87);
		a.add(87);
		a.add(88);
		System.out.println(a);

		System.out.println("Size of this obj arraylist : "+a.size());

		System.out.println("Index position of 87 is :"+a.indexOf(87));

		System.out.println("index 5 contain value is :"+a.contains(5));

		System.out.println("Remove the index 5 from obj array :"+a.remove(5));

		System.out.println("set the value at 5 th position :"+a.set(4, 99));


		System.out.println("Iteraration by Forloop");
		for(int i=0;i<a.size();i++)
		{
			System.out.println("using get retrive the value from all index :"+a.get(i));
		}

		System.out.println("iteration by foreach");
		for(Integer b:a)
		{
			System.out.println(b);
		}

		System.out.println("iterator by factory method of iterable");
		Iterator<Integer>in=a.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
	}
}
