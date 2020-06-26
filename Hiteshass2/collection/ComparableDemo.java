package practice;
import java.util.*;
class Student1256 implements Comparable<Student1256>{
	int id;
	String name;
	String city;
	public Student1256(int id, String name, String city) {
		//super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Student1256 arg0) {
		
		return this.id-arg0.id;
	}
	
	
}
public class ComparableDemo {
	public static void main(String[]args)
	{
		ArrayList<Student1256>a=new ArrayList<>();
		a.add(new Student1256(2,"hitesh","Thane"));
		a.add(new Student1256(2,"Ashok","Kalyan"));
		a.add(new Student1256(1,"Sonar","Kolsewadi"));
		a.add(new Student1256(4,"Akshay","Katemanivali"));
		a.add(new Student1256(3,"Shalu","Thane"));
		
		System.out.println(a);
		
		System.out.println("using collections sort");
		Collections.sort(a);
		System.out.println(a);
	}

}
