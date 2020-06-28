import java.util.*;
//Deque, represents a double ended queue,
//meaning a queue where you can add and remove elements to and from both ends of the queue
public class DequeEg {
    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.add(34);            //add to the begining end of the deque
        dq.add(100);
        System.out.println("add 100 "+dq);
        dq.offer(56);           //add to the tail end of the deque
        System.out.println("Offer 56 "+dq);
        dq.push(75);
        System.out.println("Push 75 "+dq);
        dq.addFirst(101);
        System.out.println("AddFirst 101 "+dq);
        dq.push(304);
        System.out.println("Push 304 "+dq);
        dq.add(888);
        System.out.println("Add 888 "+dq);
        dq.offerFirst(99);
        System.out.println("offerFirst 99 "+dq);

        //Peek
        System.out.println("Peek element "+dq.peek());
        System.out.println("Peek last element "+dq.peekLast());
        System.out.println(dq);
        System.out.println("Remove element "+dq.remove());
        System.out.println(dq);
        System.out.println("Remove last element "+dq.removeLast());
        System.out.println(dq);

        System.out.println("Poll "+dq.poll());
        System.out.println(dq);

    }
}