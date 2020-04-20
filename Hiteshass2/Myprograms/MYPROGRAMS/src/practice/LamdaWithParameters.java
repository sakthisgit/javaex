package practice;
interface Hello{
	int sum(int a);
}
public class LamdaWithParameters {
 public static void main(String[]args)
 {
	 Hello h=(a)->{
		 return a+a;
	 };
	 h.sum(5);
 }
}
