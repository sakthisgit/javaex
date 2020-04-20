package practice;

public class Wrapperclass {
	public static void main(String[]args)
	{
          int a=18;
          Integer i= Integer.valueOf(a);
          System.out.println(i);
          
          Integer ab=25;
          Integer k=new Integer(ab);
          int d=k.intValue();
          System.out.println(d);
	}
}
