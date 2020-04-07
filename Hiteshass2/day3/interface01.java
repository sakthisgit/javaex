interface Interex{
	public void displayinfo();

} //we can extend multiple inheritace also 
interface intex2 extends Interex {
public void display();
}



public class interface01 implements intex2 {
	public void displayinfo()
	{
		System.out.println("Interfacr Example");
	}

	public void display()
	{
		System.out.println("inteface ex 2");
	}

	public static void main(String []args)
	{
		interface01 i=new interface01();
		i.displayinfo();
		i.display();
	}

}
