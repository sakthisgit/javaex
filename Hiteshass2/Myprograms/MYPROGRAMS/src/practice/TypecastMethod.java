package practice;

public class TypecastMethod {
	public void show(int i)
	{
		System.out.println("ya madhe mi char c pathvla to tyachi asci value gheyil implicit casting");
		System.out.println(i);
	}
	public void display(char c)
	{
		System.out.println("ya madhe ,i int pathvle to tyach explicit casting karel ani deil bcoz int motha char peksha");
		System.out.println("char c is "+c);
	}
	public static void main(String[]args)
	{
		TypecastMethod t=new TypecastMethod();
		t.show('c');
		int i=98;
		char c=(char)i;
		t.display(c);
	}
}
