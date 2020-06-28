// Inter Thread Communication


class Resource{       // Shared Resource

     String resourceName;
     boolean lock = false;   // Lock => Conditional Variable



     public synchronized String get()    // Read Method
     {
           while (lock == false){     // Check Lock is available; if Not waiting for lock
                 try{
                       wait();
                 }
                 catch (InterruptedException ie){}                 
           }


            try{
                Thread.sleep(1000);

            }catch(Exception e){}
           
        
            lock = false;             
           notifyAll();           // Once Job is done; notify to all the threads 
           return resourceName;
     }

     public synchronized void put(String name)   // Write Method
     {
           while (lock == true)            
           {
                 try
                 {
                       wait();
                      
                 }
                 catch (InterruptedException ie){}

                 try{
                     Thread.sleep(1000);

                 }catch(Exception e){}
                
           }
           System.out.println("Producer Thread" + name);
           resourceName = name;
           lock = true;
           notifyAll();
     }


}


class Producer extends Thread{               // Producer Thread

    Resource r;

    public Producer(Resource r){
            this.r = r;
    }

    public  void run(){

        
        for(int i=0;i<10;i++){            
            r.put("Value = "+i);
        }


    }

}


class Consumer extends Thread{            // Consumer Thread
 
    Resource r;

    public Consumer(Resource r){
            this.r = r;
    }

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("Consumer Thread"+r.get());;   // Call Read Method, and get the value 
        }

            


    }

}


public class InterThreadCommunication {

    public static void main(String[] args){
        Resource r = new Resource();  // Shared Resources

        Producer p = new Producer(r);   // Object passed to producer Thread
        Consumer c = new Consumer(r);   // Same Object passed to cosumer Thread

        p.start();
        c.start();
    }

}