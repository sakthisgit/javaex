package practice;
import java.util.*;
class College{
	int clgid;
	String clgname;
	String city;
	public College(int clgid, String clgname, String city) {
		super();
		this.clgid = clgid;
		this.clgname = clgname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "College [clgid=" + clgid + ", clgname=" + clgname + ", city=" + city + "]";
	}


}
class sortbyid implements Comparator<College>
{

	@Override
	public int compare(College a, College b) {

		return a.clgid-b.clgid;
	}

}
//class sortbyclgname implements Comparator<College>
//{.
//
//	@Override
//	public int compare(College a, College b) {
//		
//		return a.city compareTo(b.city);
//	}
//	
//}
public class Comparatordemo {
	public static void main(String[]args)
	{
		ArrayList<College>map=new ArrayList<>();
		map.add(new College(105,"kgce","karjat"));
		map.add(new College(101,"tasgoankar","bhivpuri"));
		map.add(new College(109,"somaya","thane"));
		map.add(new College(111,"vjti","mumbai"));

		System.out.println(map);
		System.out.println("using sort ");
		Collections.sort(map,new sortbyid());
		System.out.println(map);


	}

}
