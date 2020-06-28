import java.util.*;
public class StackEg {
    public static void main(String[] args)
    {
        Stack<Integer> sInt = new Stack<Integer>();
        sInt.push(34);
        sInt.push(23);
        sInt.push(56);
        sInt.push(47);
        System.out.println("Stack is "+sInt);
        System.out.println("Size of stack is "+sInt.size());

        System.out.println("Pop element is "+sInt.pop());
        System.out.println("Stack after pop: "+sInt);
        System.out.println("Peek element is "+sInt.peek());

        System.out.println("Stack after peek: "+sInt);

    }    
}