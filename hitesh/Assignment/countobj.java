class Emp{
	 int id;
        static int count=0;
	Emp(int id)
	{
	this.id=id;
	 count++;
	   System.out.println("counting of object created :"+count);
	}

}

class eight{
	public static void main(String[]args)
	{
	
	Emp e=new Emp(20);
	 System.out.println("number is a :"+e.id);

	Emp b=new Emp(21);
	 System.out.println("number is a :"+b.id);
 
	Emp c=new Emp(22);
	System.out.println("number is a :"+c.id);
	 
	Emp s=new Emp(23);
	 System.out.println("number is a :"+s.id);
 
	Emp q=new Emp(24);
         System.out.println("number is a :"+q.id);
 
	
	}
}
