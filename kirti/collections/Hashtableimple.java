    import java.util.*;  
    class Hashtableimple{  
     public static void main(String args[]){  
    Hashtable<Integer,String> hashtable =new Hashtable<Integer,String>();  
      
      hashtable.put(1,"java");  
      hashtable.put(2,"c++");  
      hashtable.put(3,"c#");  
      hashtable.put(4,".net");  
      
      for(Map.Entry m:hashtable.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
	hashtable.remove(1,"java"); 
	System.out.println(hashtable);
	hashtable.remove(3); 
	System.out.println(hashtable);

     }  
    }  
