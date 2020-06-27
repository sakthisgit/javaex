import java.util.*;  
class arraylistdemo1{  
  public static void main(String args[]){  
     ArrayList<Integer> obj2 = new ArrayList <Integer>();  
     obj2.add(11);  
     obj2.add(22);  
     obj2.add(33);  
     obj2.add(44); 
     obj2.add(55);
     obj2.add(66);
      
      System.out.println(obj2);

      //Removing 3rd element
      obj2.remove(3);
      obj2.remove(2);
      System.out.println(obj2);
}
}
