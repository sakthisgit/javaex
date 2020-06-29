 import java.util.Vector;  
    public class Vectorimpl {    
        public static void main(String arg[]) {  

              Vector<String> vector = new Vector<>(4);  

              vector.add("pune");  
              vector.add("mumbai");  
              vector.add("satara");              
              for (String str : vector) {           
                 System.out.println(str);  
              } 
            System.out.println("capacity of vectore is="+vector.capacity()); 
	      vector.setSize(10);  
	      System.out.println("size of vector is="+vector.size()); 


          }  
    }  
