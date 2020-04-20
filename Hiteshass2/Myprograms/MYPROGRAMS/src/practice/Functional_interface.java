package practice;
interface Student101{
	void read();
}
public class Functional_interface implements Student101 {


	public void read() {
		System.out.println("Students reads in library");		
	}
	public static void main(String[]args)
	{
		Functional_interface f=new Functional_interface();
		f.read();
	}

}