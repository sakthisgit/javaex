import java.util.*;  
class arraylistdemo{  
  public static void main(String args[]){  
     ArrayList<String> obj1=new ArrayList<String>();  
     obj1.add("kirti");  
     obj1.add("vibhawari");  
     obj1.add("aditya");  
     obj1.add("amey"); 
     obj1.add("angha");
     obj1.add("aditi");

     //iterating ArrayList
     for(String str: obj1)  
        System.out.println(str);  
      
      System.out.println(obj1);

    //Removing element using elementname
      obj1.remove("amey");
      obj1.remove("aditi");

      System.out.println(obj1);

      //Removing 2nd element
      obj1.remove(2);
     
      System.out.println(obj1);
}
}
