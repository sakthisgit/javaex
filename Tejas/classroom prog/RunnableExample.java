
public class RunnableExample implements Runnable {

    public RunnableExample(String tname){
        Thread t= new Thread(this);
        t.setName(tname);
        t.start();
    }
   

    public void run(){
        synchronized(this){
            for(int j=0; j<6   ;j++){
                    System.out.println(Thread.currentThread().getName() +"    "+ j);
                }
        }
    }

    public static void main(String[] args){
        
        RunnableExample r1 = new RunnableExample("Thread-I");
        RunnableExample r2 = new RunnableExample("Thread-II");
        RunnableExample r3= new RunnableExample("Thread-III");
        RunnableExample r4 = new RunnableExample("Thread-IV");
        RunnableExample r5 = new RunnableExample("Thread-V");
       /* Thread t1 =new Thread(r1);
        t1.setName("Thread-I");
        t1.start();

        RunnableExample r2 = new RunnableExample();
        Thread t2 = new Thread(r2);
        t2.start();

        Thread t3 = new Thread(new RunnableExample());
        t3.start();*/
        
    }

}