public class Anonymous {
    public static void main(String[] args)
    {
        Thread t1 =  new Thread(new Runnable()
        {
            public void run()
            {
                for(int i = 0;i<10;i++)
                System.out.println("Base class of Runnable "+i);
            }
        }
        );

        t1.start();
    }
}