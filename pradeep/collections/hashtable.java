import java.util.*;  
class hashtable
{  
 public static void main(String args[])
{  
    Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
     map.put(100,"prad");    
     map.put(102,"deep");   
     map.put(101,"raj");    
     map.put(103,"m");    
     System.out.println("Initial Map: "+map);  
    
     map.putIfAbsent(104,"virat");  
     System.out.println("Updated Map: "+map);  
     
     map.putIfAbsent(101,"kohli");  
     System.out.println("Updated Map: "+map);  
 }  

