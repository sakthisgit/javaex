import java.util.*;  
class hashtable
	{
		public static void main(String args[])
		{  
			Hashtable<Integer,String> ht =new Hashtable<Integer,String>();  

			ht.put(1,"100");  
			ht.put(2,"200");  
			ht.put(3,"300");  
			ht.put(4,"400");  

			for(Map.Entry i:ht.entrySet()){  
			System.out.println(i.getKey()+" "+i.getValue());  
		}  
		System.out.println("removing 1st value");
		ht.remove(1); 
		System.out.println(ht);
		System.out.println("removing 3rd value");
		ht.remove(3); 
		System.out.println(ht);
	}
}  
