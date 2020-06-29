import java.util.*;  
	public class hashmap
	{  
		public static void main(String args[])
		{  
	       	HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	       	hm.put(1,"a");
	       	hm.put(2,"ab");
	       	hm.put(3,"abc");
	       	hm.put(4,"abcd");
	       	hm.put(5,"abcde");
               
       		for(Map.Entry i : hm.entrySet())
			{    
       			System.out.println(i.getKey()+" "+i.getValue());   
       		} 
	  		hm.remove(2); 
         		System.out.println(hm);
		}  
}  
