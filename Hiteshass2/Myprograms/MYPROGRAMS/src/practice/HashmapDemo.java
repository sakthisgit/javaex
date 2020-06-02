package practice;
import java.util.*;

import java.util.Map.Entry;

public class HashmapDemo {
	public static void main(String[]args)
	{
		HashMap <Integer,Integer>h=new HashMap<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			h.put(sc.nextInt(),sc.nextInt());
		}
		System.out.println(h);

		System.out.println("using foreach keyset");
		for(int a:h.keySet())
		{
			System.out.println(a);
		}
		System.out.println("using foreach values");
		for(int q:h.values())
		{
			System.out.println(q);
		}
		System.out.println("using foreach entryset");
		for(Entry<Integer, Integer> e:h.entrySet())
		{
			System.out.println(e);
			System.out.println("key is :"+e.getKey()+"get values :"+e.getValue());
		}

		System.out.println("using Iterator entry");
		Iterator<Entry<Integer,Integer>>i=h.entrySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
