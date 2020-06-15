public class ThreadExample extends Thread{

	public ThreadExample(String name){
		setName(name);
		start();
	}

	public void run(){
		for(int i=0; i<1000; i++)
			System.out.println(getName());
	}


	public static void main(String[] args){

		ThreadExample t1 = new ThreadExample("Thread.II"); 
	         ThreadExample t2 = new ThreadExample("Thread.II"); 
        
	}
}
