package practice;
class Name{
	String Firstname;
	String LastName;
	public Name(String firstname, String lastName) 
	{
		Firstname = firstname;
		LastName = lastName;
	}
	
}
class EmpExam {
	int age;
	Name n;
	public void display(int age,Name n)
	{
		System.out.println("First name is :"+n.Firstname);
		System.out.println("Last name is :"+n.LastName);
		System.out.println("age is :"+age);
	}
}
public class HasRelation2 {
	public static void main(String[]args)
	{
		Name n=new Name("Hitesh","Sonar");
		EmpExam e=new EmpExam();
		e.display(22, n);
	}
}
