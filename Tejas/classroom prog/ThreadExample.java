public class ThreadExample extends Thread{


   

    public void run(){

        //try{
        for(int i=0; i<1000;i++){
            //Thread.sleep(1000);
            System.out.println(getName() +"   "+i);
        }
           
       
            

    }

    public static void main(String[] args){

        ThreadExample t1 = new ThreadExample();
        t1.setName("Thread-I");
        t1.setPriority(1);
        


         ThreadExample t2 = new ThreadExample();
         t2.setName("Thread-II");
         t2.setPriority(10);
        
        ThreadExample t3 = new ThreadExample();
        t3.setName("Thread-III");
        t3.setPriority(5);

        t1.start();
        t2.start();
       t3.start();
    }
}