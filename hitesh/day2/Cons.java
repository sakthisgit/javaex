import pkg1.pkgexample;
class Hitesh{
String name;
Hitesh ()
{
	this("Ashok");
}
Hitesh(String a)
{
	this.name=a;
}
public void display()
{
	System.out.println(name);
}
public static void mystaticmethod(){
	System.out.println("Static method call by class name only");
}
}

public class Cons{
public static void main (String[]args)
{
Hitesh h=new Hitesh("Hitesh");
h.display();
Hitesh b=new Hitesh();
b.display();
Hitesh.mystaticmethod();

pkg1.pkgexample p=new pkg1.pkgexample();
p.display();
}
}
