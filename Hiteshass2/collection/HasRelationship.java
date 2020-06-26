package practice;
class Address{
	String roomno,street,city;
	int pincode;
	
	Address(String r,String s,String c,int p)
	{
		this.roomno=r;
		this.street=s;
		this.city=c;
		this.pincode=p;
	}
}
class Student11 {
	String name ,Department;
	int rollnum;
	Address ad;
	Student11(String n,String D,int r,Address ad)
	{
		this.name=n;
		this.Department=D;
		this.rollnum=r;
		this.ad=ad;
	}
	public void show()
	{
		System.out.println("Name is :"+name);
		System.out.println("Roll num is :"+rollnum);
		System.out.println("Department is :"+Department);
		System.out.println("Room number is :"+ad.roomno);
		System.out.println("Street is :"+ad.street);
		System.out.println("City is :"+ad.city);
		System.out.println("Pincode is :"+ad.pincode);
	}
}
public class HasRelationship {
	public static void main(String[]args)
	{
		Address ad=new Address("11","kolsewadi","Kalyan",421306);
		Student11 s=new Student11("Hitesh","IT",12,ad);
		s.show();
	}

}
