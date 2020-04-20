package practice;
import java.util.*;
public class Arraylistdemo4 {
	
	public static void main(String[]args)
	{
		List <String>l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		for(int k=0;k<5;k++)
		{
			l.add(sc.next());
		}
		
		System.out.println("Print that String using ListIterator");
		ListIterator<String>li=l.listIterator();
		System.out.println("Forward direction iteration");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("backword direction iteration");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
