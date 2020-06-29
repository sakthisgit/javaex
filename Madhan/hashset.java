import java.util.*;  
class hashset
{  
	public static void main(String args[])
	{  
      		HashSet<String> hs=new HashSet<String>();  
               hs.add("100");  
               hs.add("200");  
               hs.add("300");  
               hs.add("400");  
               System.out.println(hs);  
               
	       hs.remove("200");  
	       System.out.println(hs);   
               
       	HashSet<String> hss=new HashSet<String>();  
               hss.add("800");  
               hss.add("900");  
	       System.out.println(hss);
              
               hs.addAll(hss);  
               System.out.println("Updated List: "+hs);   
        
	       hss.removeAll(hss);  
	       System.out.println(hss);
 
	}

}  
