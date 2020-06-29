class ResourcePool {
    static String resource1 = "Resource1";
    static String resource2 = "Resource2";
}

class Thread1 extends Thread {

   

    public void run() {
        synchronized (ResourcePool.resource1) {
            System.out.println("Thread 1: Locked r1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            synchronized (ResourcePool.resource2) {
                System.out.println("Thread 1: Locked r2");
            }
        }
    }
}

class Thread2 extends Thread {

 

    public void run() {
        synchronized (ResourcePool.resource2) {
            System.out.println("Thread 2: Locked r2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            synchronized (ResourcePool.resource1) {
                System.out.println("Thread 2: Locked r1");
            }
        }
    }

}

public class DeadlockExample {

    public static void main(String[] args) {
       
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }

}