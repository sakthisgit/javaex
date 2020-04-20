package practice;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[]args)
	{
		ArrayDeque<Integer>a=new ArrayDeque<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		a.addFirst(25);
		a.addLast(88);
		System.out.println(a);
		System.out.println("get first and get last : "+a.getFirst()+" : "+a.getLast());
		System.out.println("remove first and remove last :"+a.removeFirst()+":"+a.removeLast());
		System.out.println(a);
		System.out.println("using special methods");
		a.offerFirst(77);
		a.offerLast(147);
		System.out.println(a);
		System.out.println("peek using :"+a.peekFirst());
		System.out.println("peek using :"+a.peekLast());
		System.out.println("using poll :"+a.poll());
		System.out.println(a);
	}
}
