import java.util.*;  
	public class hashmap
	{  
		public static void main(String args[])
		{  
	       	HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	       	hm.put(1,"100");
	       	hm.put(2,"200");
	       	hm.put(3,"300");
	       	hm.put(4,"400");
	       	hm.put(5,"500");
               
       		for(Map.Entry i : hm.entrySet())
			{    
       			System.out.println(i.getKey()+" "+i.getValue());   
       		} 
	  		hm.remove(2); 
         		System.out.println(hm);
		}  
}  
