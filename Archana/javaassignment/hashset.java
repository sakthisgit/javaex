//hashset
 import java.util.*;  
 class hashset
{  
     public static void main(String args[]){  
      HashSet<String> hashset=new HashSet<String>();  
               hashset.add("ksb");  
               hashset.add("tata");  
               hashset.add("google");  
               hashset.add("amazon");  
               System.out.println(hashset);  
               
	       hashset.remove("tata");  
	       System.out.println(hashset);   
               
       	       HashSet<String> hashset1=new HashSet<String>();  
               hashset1.add("cognizant");  
               hashset1.add("wipro");  
	       System.out.println(hashset1);
              
               hashset.addAll(hashset1);  
               System.out.println("Updated List: "+hashset);   
        
	       hashset.removeAll(hashset1);  
	       System.out.println(hashset);

//linkedhashset

	System.out.println("linkedhasset implementaion");   
 LinkedHashSet<String> hashset2=new LinkedHashSet<String>();  
               hashset2.add("wipro");  
               hashset2.add("cognizant");  
               hashset2.add("amazon");  
               System.out.println(hashset2);  
               
	       hashset.remove("wipro");  
	       System.out.println(hashset2);   
               
       	       HashSet<String> hashset3=new HashSet<String>();  
               hashset3.add("ksb");  
               hashset3.add("google");  
	       System.out.println(hashset3);
              
               hashset2.addAll(hashset3);  
               System.out.println("Updated List: "+hashset2);   
        
	       hashset.removeAll(hashset3);  
	       System.out.println(hashset2);
    

//treeset    
	System.out.println("treeset implementaion"); 
System.out.println("linkedhasset implementaion");   
 TreeSet<String> hashset4=new TreeSet<String>();  
               hashset4.add("acts");  
               hashset4.add("dac");  
               hashset4.add("dbda");  
               System.out.println(hashset4);  
               
	       hashset4.remove("dac");  
	       System.out.println(hashset4);   
               
    
}

 }  
