package practice;
import java.util.*;
public class VectorDemo {
	public static void main(String[]args)
	{
		Vector <Integer>v=new Vector<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			v.add(sc.nextInt());
		}
		System.out.println(v);
		System.out.println("get index 4:"+v.indexOf(4));
		System.out.println("check value 55 is there :"+v.contains(55));
		v.set(2, 88);
		System.out.println(v);
		System.out.println("get value :"+v.get(4));
		System.out.println(v.remove(2));
		System.out.println("size of vector :"+v.size());

		System.out.println("vector legacy class iterartion using Enumeration");
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}
}
