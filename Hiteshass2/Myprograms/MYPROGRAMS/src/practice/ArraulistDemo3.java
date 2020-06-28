package practice;
import  java.util.*;
public class ArraulistDemo3 {
	
	public static void main(String[]args)
	{
		ArrayList<Integer>i=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		for(int k=0;k<5;k++)
		{
			i.add(sc.nextInt());
		}
		System.out.println("Scanning done");
		
		System.out.println("Itertation using foreachloop");
		for(int j:i)
		{
			System.out.println(j);
			//i.remove(j);
		}
		System.out.println("Itertation using factory method");
		Iterator<Integer>s=i.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
			s.remove();
			System.out.println("print after remove this num");
			System.out.println(s);
			
		}


	}
}
