import java.util.*;
public class linkedlist{
   public static void main(String args[]){

     LinkedList<String> obj=new LinkedList<String>();
     obj.add("archana");
     obj.add("pooja");
     obj.add("sonu");
     obj.add("aditi");
     obj.add("kirti");
     System.out.println("elements in linkedlist: " +obj);
  
     obj.addFirst("Aditya");
     obj.addLast("Priya");
    System.out.println("elements in linkedlist: " +obj);

     obj.add(3, "pari");
    System.out.println("elements in linkedlist: " +obj);

     Iterator<String> iterator=obj.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
       }
 
       obj.removeFirst();
       System.out.println("elements in linkedlist: " +obj);

       obj.removeLast();
       System.out.println("elements in linkedlist: " +obj);

       obj.remove(4);
       System.out.println("elements in linkedlist: " +obj);

   } 
} S
