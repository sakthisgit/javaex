package practice;
import java.util.*;
public class DequeLinkedList {
	public static void main(String[]args)
	{
		Deque<Integer> d=new LinkedList<>();
		System.out.println("Enter the values");
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<3;i++)
		{
			d.add(sc.nextInt());
		}
		System.out.println(d);
		d.addFirst(988);
		d.addLast(777);
		System.out.println(d);
		System.out.println("55 is in queue or not "+d.contains(55));
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
	}
}
