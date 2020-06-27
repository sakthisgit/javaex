import java.util.*;
public class Stackimplement
{
    public static void main(String[] args)
    {
        Stack<Integer> obj1 = new Stack<Integer>();
	System.out.println("Stack Empty : "+obj1.isEmpty());
        obj1.push(10);
        obj1.push(22);
        obj1.push(333);
        obj1.push(4000);
        System.out.println(obj1);
        obj1.pop();
        System.out.println(obj1);
        obj1.peek();
        System.out.println(obj1);
	obj1.push(2200);
	 System.out.println(obj1);

    }    
}
