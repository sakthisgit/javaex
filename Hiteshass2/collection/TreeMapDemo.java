package practice;
import java.util.*;
import java.util.Map.Entry;
class Employee1598{
	int id;
	String name;
	String city;
	int salary;
	public Employee1598(int id, String name, String city, int salary) {

		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1598 [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}


}
public class TreeMapDemo {
	public static void main(String[]args)
	{
		TreeMap<Integer,Employee1598>map=new TreeMap<>();
		map.put(1, new Employee1598(101,"Hitesh","kalyan",25000));
		map.put(2, new Employee1598(102,"Akshay","katemanivali",250));
		map.put(3, new Employee1598(103,"kirti","satara",55000));
		map.put(4, new Employee1598(104,"Tejas","Bhivandi",75000));
		map.put(5, new Employee1598(105,"Rupen","chennai",5000));

		System.out.println(map);
		System.out.println ("using iterating");
		Iterator<Entry<Integer,Employee1598>>map2=map.entrySet().iterator();
		while(map2.hasNext())
		{
			System.out.println(map2.next());
		}
	}

}
