import java.util.*;  
class arraylistdemo1{  
  public static void main(String args[]){  
     ArrayList<Integer> obj1 = new ArrayList <Integer>();  
     obj1.add(11);  
     obj1.add(22);  
     obj1.add(33);  
     obj1.add(44); 
     obj1.add(55);
     obj1.add(66);
      
      System.out.println(obj1);

      //Removing 3rd element
      obj1.remove(3);
      obj1.remove(2);
      System.out.println(obj1);
}
}
