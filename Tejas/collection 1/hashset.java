import java.util.*;  
class hashset
{  
	public static void main(String args[])
	{  
      		HashSet<String> hs=new HashSet<String>();  
               hs.add("300");  
               hs.add("400");  
               hs.add("110");  
               hs.add("120");  
               System.out.println(hs);  
               
	       hs.remove("120");  
	       System.out.println(hs);   
               
       	HashSet<String> hss=new HashSet<String>();  
               hss.add("660");  
               hss.add("77");  
	       System.out.println(hss);
              
               hs.addAll(hss);  
               System.out.println("Updated List: "+hs);   
        
	       hss.removeAll(hss);  
	       System.out.println(hss);
 
	}

}  
