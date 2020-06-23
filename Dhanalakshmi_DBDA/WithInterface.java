class Runner implements Runnable{
    @Override
    public void run()
    {
    for(int i=0;i<10;i++)
        System.out.println("Runner thread: "+toString()+"\t"+i);
    try
    {
        Thread.sleep(50);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    public void start()
    {
        run();
    }
}

public class WithInterface {
    public static void main(String[] args)
    {
        Runner r1 = new Runner();
        r1.start();
    }
    
}