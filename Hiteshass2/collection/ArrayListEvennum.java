package practice;
import java.util.*;
public class ArrayListEvennum {
	public static void main(String[]args)
	{
		List<Integer>l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		for(int k=0;k<5;k++)
		{
			l.add(sc.nextInt());
		}

		System.out.println("using factory and remove method  find even num");
		Iterator<Integer>i=l.iterator();
		while(i.hasNext())
		{
			Integer a=i.next();
			if(a%2!=0)
			{
				i.remove();
			}

		}
		System.out.println(l);
	}
}
