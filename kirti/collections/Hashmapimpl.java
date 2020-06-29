import java.util.*;  
  public class Hashmapimpl{  
     public static void main(String args[]){  
       HashMap<Integer,String> hashmap=new HashMap<Integer,String>();    
       hashmap.put(1,"dac");   
       hashmap.put(2,"dbda");    
       hashmap.put(3,"dmc"); 
       hashmap.put(4,"AI");  
       hashmap.put(5,"dssd");   
            
       for(Map.Entry m : hashmap.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());   
       }  
	  hashmap.remove(3,"dmc"); 
	 System.out.println(hashmap); 
	  hashmap.remove(2); 
         System.out.println(hashmap);
    }  
    }  
