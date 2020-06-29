import java.util.*;
public class linkedlistdemo{
   public static void main(String args[]){

     LinkedList<String> ll=new LinkedList<String>();
     ll.add("kirti");
     ll.add("amey");
     ll.add("vibhawari");
     ll.add("aditi");
     ll.add("ranveer");
     System.out.println("elements in linkedlist: " +ll);
  
     ll.addFirst("Aditya");
     ll.addLast("Kedar");
    System.out.println("elements in linkedlist: " +ll);

     ll.add(3, "pari");
    System.out.println("elements in linkedlist: " +ll);

     Iterator<String> iterator=ll.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
       }
 
       ll.removeFirst();
       System.out.println("elements in linkedlist: " +ll);

       ll.removeLast();
       System.out.println("elements in linkedlist: " +ll);

       ll.remove(4);
       System.out.println("elements in linkedlist: " +ll);

   } 
} S
