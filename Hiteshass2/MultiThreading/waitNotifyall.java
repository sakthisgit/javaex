class Resource{
     String resourceName;
     boolean Flag = false;



     public synchronized String pull()
     {
           while (Flag == false){
                 try{
                       wait();
                 }
                 catch (InterruptedException ie){}

           }
           try{
            Thread.sleep(1000);

        }catch(Exception e){
	System.out.println(e);
		}
           Flag = false;
           notifyAll();
           return resourceName;
     }

     public synchronized void push(String name)
     {
           while (Flag == true)
           {
                 try
                 {
                       wait();

                 }
                 catch (InterruptedException ie){}

                 try{
                     Thread.sleep(1000);

                 }catch(Exception e){
			System.out.println(e);			
			}

           }
           System.out.println("Producer Thread" + name);
           resourceName = name;
           Flag = true;
           notifyAll();
     }


}


class Producer extends Thread{

    Resource r;

    public Producer(Resource r){
            this.r = r;
    }

    public  void run(){


        for(int i=0;i<10;i++){            
            r.push("Value = "+i);
        }


    }

}


class Consumer extends Thread{

    Resource r;

    public Consumer(Resource r){
            this.r = r;
    }

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("Consumer Thread"+r.pull());
        }




    }

}




public class InterThreadCommunication {

    public static void main(String[] args){
        Resource r = new Resource();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        p.start();
        c.start();
    }

}
