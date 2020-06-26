package practice;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapdemo {
	public static void main(String[]args)
	{
		LinkedHashMap<Integer,Integer>l=new LinkedHashMap<>();
		System.out.println("Enter the age and name of person ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			l.put(sc.nextInt(),sc.nextInt());
		}
		System.out.println(l);

		System.out.println("iterating using entry set");
		Iterator<Entry<Integer,Integer>>map=l.entrySet().iterator();
		while(map.hasNext())
		{
			System.out.println(map.next());
		}
	}
}
