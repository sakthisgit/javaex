import java.util.*;  
class hashtable
	{
		public static void main(String args[])
		{  
			Hashtable<Integer,String> ht =new Hashtable<Integer,String>();  

			ht.put(1,"A");  
			ht.put(2,"B");  
			ht.put(3,"C");  
			ht.put(4,"D");  

			for(Map.Entry i:ht.entrySet()){  
			System.out.println(i.getKey()+" "+i.getValue());  
		}
		ht.remove(1); 
		System.out.println(ht);
		ht.remove(3); 
		System.out.println(ht);
	}
}  
