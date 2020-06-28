package practice;

class Car{
	void typevehicle()
	{
		System.out.println("type is char chaki car");
	}
}
class Honda extends Car{
	void brand()
	{
		System.out.println("brand is Honda");
	}
}
class Maruti extends Honda{
	void brand()
	{
		System.out.println("brand is Maruti");
	}
}
public class Herachicalinheritance {

	public static void main(String[] args) {
		Maruti m=new Maruti();
		m.brand();
		m.brand();
		m.typevehicle();
		
		Honda h=new Honda();
		h.brand();
				

	}

}
