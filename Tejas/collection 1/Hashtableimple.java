    import java.util.*;  
    class Hashtableimple{  
     public static void main(String args[]){  
    Hashtable<Integer,String> hashtable =new Hashtable<Integer,String>();  
      
      hashtable.put(1,"ab");  
      hashtable.put(2,"abc");  
      hashtable.put(3,"abcd");  
      hashtable.put(4,"def");  
      
      for(Map.Entry m:hashtable.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
	hashtable.remove(1,"ab"); 
	System.out.println(hashtable);
	hashtable.remove(3); 
	System.out.println(hashtable);

     }  
    }  
