package practice;
import java.util.*;
public class CollectionsDemo {
	public static void main(String[]args)
	{
		ArrayList<Integer>a=new ArrayList<>();
		a.add(5);
		a.add(87);
		a.add(54);
		a.add(78);
		a.add(87);
		
		System.out.println("Collections sort method");
		Collections.sort(a);
		System.out.println(a);
		

		System.out.println("Collections shuffle method");
		Collections.shuffle(a);
		System.out.println(a);
		

		System.out.println("Collections reverse method");
		Collections.reverse(a);
		System.out.println(a);
		

		System.out.println("Collections rotate method");
		Collections.rotate(a, 2);
		System.out.println(a);
		

		System.out.println("Collections swap method");
		Collections.swap(a, 2, 4);;
		System.out.println(a);
		
		System.out.println(a);
	}
}
