package practice;
import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[]args)
	{
		LinkedList<Integer>l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		for(int k=0;k<5;k++)
		{
			l.add(sc.nextInt());
		}
		System.out.println(l);
		l.set(3, 88);
		System.out.println(l);
		System.out.println("getting value from 6 th index :"+l.get(4));
		System.out.println(" 5 value obj contain or not :"+l.contains(5));
		System.out.println("index 1 which value :"+l.indexOf(1));
		System.out.println("remove value from array :"+l.remove(2));
		System.out.println(l);
	}

}
