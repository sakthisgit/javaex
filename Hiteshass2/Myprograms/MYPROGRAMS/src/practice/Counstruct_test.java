package practice;
class Student1{
	int age;
	public Student1()
	{
		age=20;
	}
	 Student1(int age) {
	
		this.age = age;
	}
	void show()
	{
		System.out.println(age);
	}
	
}
public class Counstruct_test {
	public static void main(String[]args)
	{
		Student1 s=new Student1();
		s.show();
		Student1 m=new Student1(25);
		m.show();
	}

}
