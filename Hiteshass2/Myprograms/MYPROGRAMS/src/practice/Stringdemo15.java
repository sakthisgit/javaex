package practice;

public class Stringdemo15 {
	public static void main(String[]args)
	{
		String str2="",str="Hitesh sonar Ashok";
		String arr[]=str.split(" ");
		//for(int i=0;i<arr.length;i++)
		for(int i=arr.length-1;i>0;i--)
		{
			str2=str2+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(str2);
	}
}
