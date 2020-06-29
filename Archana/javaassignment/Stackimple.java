import java.util.*;
public class Stackimpl
{
    public static void main(String[] args)
    {
        Stack<Integer> obj = new Stack<Integer>();
	System.out.println("Stack Empty : "+obj.isEmpty());
        obj.push(15);
        obj.push(28);
        obj.push(46);
        obj.push(88);
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
        obj.peek();
        System.out.println(obj);
	obj.push(2200);
	 System.out.println(obj);

    }    
}
