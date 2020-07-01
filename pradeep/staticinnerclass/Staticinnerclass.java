package assign1;


public  class Staticinnerclass 

{
	void mainclassdisplay()
	{
		System.out.println("pradeep is good boy");
	}
	static class car
	{
	String type;
	int model;
	String owner;
	car(String type,int model,String owner)
	{
		this.type=type;
		this.model=model;
		this.owner=owner;
	}
	void display()
	{
	 System.out.println("Type  is :"+type);
	 System.out.println("model is:"+model);
	 System.out.println("owner is :"+owner);
	}
	
	}

    static class bike extends car
    {

		bike(String type, int model, String owner)
		{
			super(type, model, owner);
		
		}
    }
	public static void main(String args[])
	{
		Staticinnerclass st=new Staticinnerclass();
		st.mainclassdisplay();
		System.out.println("\n car details:\n");
	  car c1=new car("nil",2025,"pradeep");
	  c1.display();
	  System.out.println("\nbike details:\n");
	    bike b1=new bike("yamahaR15",2017,"Raj");
		b1.display();
	}
}


