package cdac;

abstract class Absc{
	abstract void Honda();
	abstract void BMW();
    abstract void AUDI();
}
class description extends Absc{
	
	void Honda()
	{
		System.out.println("Honda is nice brand");
	}
	void BMW()
	{
		System.out.println("The cost of BMW is to high");
	}
	void AUDI()
	{
		System.out.println("The Audi brand symbol is too unique");
	}
	public static void main(String[] args) {
		Absc a =new description();
		a.Honda();
        a.BMW();
        a.AUDI();
	}

}
