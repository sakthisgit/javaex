import java.util.*;
public class LinkedListEg {

    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("100");
        ll.add("200");   
        ll.addFirst("300");
        ll.add(1,"50");
        System.out.println(ll);
        System.out.println("Size of the list is: "+ll.size());
        
        System.out.println("Find 300:  "+ll.contains("300"));
        ll.remove("50");
        System.out.println("Latest update : "+ll);    
        
        ll.set(1,"100");
        System.out.println("Latest update : "+ll);
	System.out.println("Size of the list is: "+ll.size());
    }
    
}
