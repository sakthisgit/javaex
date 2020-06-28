 import java.util.Vector;  
    public class Vectorimpl {    
        public static void main(String arg[]) {  

              Vector<String> vc = new Vector<>(4);  

              vc.add("pune");  
              vc.add("mumbai");  
              vc.add("satara");              
              for (String str : vc) {           
                 System.out.println(str);  
              } 
            System.out.println("capacity of vectore is="+vc.capacity()); 
	      vc.setSize(10);  
	      System.out.println("size of vector is="+vc.size()); 


          }  
    }  
