package practice;
import java.util.*;
import java.util.Map.Entry;
public class Hashmapagehashmapdemo {
	public static void main(String[]args)
	{
		HashMap<Integer,String>h=new HashMap<>();
		HashMap<String,String>h1=new HashMap<>();
		System.out.println("Enter the age and name of person ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			h.put(sc.nextInt(),sc.next());
		}
		System.out.println(h);

		System.out.println("using entry set find the age greater than 18 and put in h1 ");
		Iterator<Entry<Integer,String>>map1=h.entrySet().iterator();
		while(map1.hasNext())
		{
			Entry<Integer,String>e=map1.next();
			int age=e.getKey();
			String name=e.getValue();
			if(age>18)
			{
				h1.put(name, "Valid age");
			}
			else
			{
				h1.put(name, "Not Valid age");
			}
		}
		System.out.println("h1 age valid or not showing obj here");
		Iterator<Entry<String,String>>map2=h1.entrySet().iterator();
		while(map2.hasNext())
		{
			System.out.println(map2.next());
		}

	}
}
