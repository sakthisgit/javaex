package practice;

interface Emp11{
	void name();
}
public class InterfaceAnnon2 {
	public static void main(String[]args)
	{
		Company1236 c=new Company1236() {
			public void salary()
			{
				System.out.println("It sector has too much income");
			}
		};
		c.salary();
		Emp11 e=new Emp11() {
			public void name()
			{
				System.out.println("name is Hitesh");
			}
		};
		e.name();
	}

}
