import java.util.*;
public class LinkedListEg {

    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Apple");
        ll.add("Banana");   
        ll.addFirst("Strawberry");
        ll.add(1,"Papaya");
        System.out.println(ll);
        System.out.println("Size of the list is: "+ll.size());
        
        System.out.println("Does list contains Papaya: "+ll.contains("Papaya"));
        System.out.println("Class of this list is "+ll.getClass());
        ll.remove("Papaya");
        System.out.println("After removing Papaya: "+ll);    
        
        ll.set(1,"Orange");
        System.out.println("Replaced Apply by Orange in list: "+ll);

    }
    
}