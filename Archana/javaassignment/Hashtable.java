    import java.util.*;  
    class Hashtable{  
     public static void main(String args[]){  
    Hashtable<Integer,String> hashtable =new Hashtable<Integer,String>();  
      
      hashtable.put(1,"c");  
      hashtable.put(2,"php");  
      hashtable.put(3,"c++");  
      hashtable.put(4,"java");  
      
      for(Map.Entry m:hashtable.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
	hashtable.remove(4,"java"); 
	System.out.println(hashtable);
	hashtable.remove(3,"c++"); 
	System.out.println(hashtable);

     }  
    }  
