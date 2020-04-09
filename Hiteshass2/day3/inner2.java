class outer{
	String name = "Hitesh";
	class inner{
		public void display()
		{ 
			System.out.println("Inner class method :"+name);
		}
	}

}

public class inner2{
	public static void main(String[]args)
	{
		outer o=new outer();
		outer.inner i=o.new inner();
		i.display();
		

	}


}
