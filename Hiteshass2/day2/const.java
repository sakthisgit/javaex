class A{
 String name;
  public A(String name)
  {
	 this. name=name;
  }
  public void display()
  {
	  System.out.println(name);
  }

}
class const{

public static void main (String[]arg)
{       
        A a=new A("Hitesh");
	a.display();

	A b=new A("Ashok");
	b.display();
} 
}
