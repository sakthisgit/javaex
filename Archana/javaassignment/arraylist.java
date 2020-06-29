import java.util.*;  
class arraylistdemo{  
  public static void main(String args[]){  
     ArrayList<String> obj=new ArrayList<String>();  
     obj.add("archana");  
     obj.add("sonu");  
     obj.add("aditya");  
     obj.add("kundan"); 
     obj.add("pragati");
     obj.add("deepak");

     //iterating ArrayList
     for(String str: obj)  
        System.out.println(str);  
      
      System.out.println(obj);

    //Removing element using elementname
      obj.remove("aditya");
      obj.remove("deepak");

      System.out.println(obj);

      //Removing 2nd element
      obj.remove(2);
     
      System.out.println(obj);
}
}
