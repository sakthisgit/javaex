package practice;
import java.util.*;
public class HashMapDemo {
	public static void main(String[]args)
	{
		HashMap<Integer,String>h=new HashMap<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			h.put(sc.nextInt(),sc.next());
		}
		System.out.println(h);
		System.out.println("contsain key : "+h.containsKey(4));
		System.out.println("contain value :"+h.containsValue(88));
		System.out.println("size of map :"+h.size());
		System.out.println(h.isEmpty());
	}
}
