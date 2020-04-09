package cdac;

public class Staticinner {
	static int data=30;
	static class inner{
		void dt()
		{
			System.out.println("the data is :"+data);
		}
	}

	public static void main(String[] args) {
		Staticinner.inner s =new Staticinner.inner();
		s.dt();

	}

}
