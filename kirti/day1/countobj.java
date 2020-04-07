class manager{
	int id;
        static int count=0;
	manager(int id)
	{
	this.id=id;
	count++;
        System.out.println("counting of object created :"+count);
	}

}

class countobj{
	public static void main(String[]args)
	{
	
	manager obj1=new manager(1);
	 System.out.println("number is a :"+obj1.id);

	manager obj2=new manager(2);
	 System.out.println("number is a :"+obj2.id);
 
	manager obj3=new manager(3);
	System.out.println("number is a :"+obj3.id);
	 
 
	
	}
}
