package firstprj;

class  enum1
{
String firstname;
genders gen;
public enum1(String firstname,genders gen)
{
	this.gen=gen;
	this.firstname=firstname;
}
public void display()
{
	System.out.println("name:"+firstname);
	System.out.println("Gender:"+gen);
}

}
public class enumclass
{
	public static void main(String args[])

     {
		enum1 en=new enum1("pradeep",genders.male);
		en.display();
		enum1 en1=new enum1("natasha",genders.female);
		en1.display();
	}
}
