import java.util.*;
public class Stackexercise
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<Integer>();
	System.out.println("Stack Empty : "+s.isEmpty());
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println("Stack contains : "+s);
        System.out.println("Size is "+s.size());
        System.out.println("Pop "+s.pop());
        System.out.println("Stack Latest update: "+s);
        System.out.println("Peeking last value "+s.peek());
        System.out.println("Stack Latest update: "+s);

    }    
}
