import java.util.*;  
	public class hashmap
	{  
		public static void main(String args[])
		{  
	       	HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	       	hm.put(1,"111");
	       	hm.put(2,"222");
	       	hm.put(3,"333");
	       	hm.put(4,"444");
	       	hm.put(5,"555");
               
       		for(Map.Entry i : hm.entrySet())
			{    
       			System.out.println(i.getKey()+" "+i.getValue());   
       		} 
	  		hm.remove(2); 
         		System.out.println(hm);
		}  
}  
