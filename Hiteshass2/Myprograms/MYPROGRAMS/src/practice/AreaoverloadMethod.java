package practice;

import java.util.Scanner;

class Area
{
	public int area1(int length,int width)
	{
		return  length*width;
	}
	public double area1(double radius)
	{
		return 3.14*radius*radius;
	}
}
public class AreaoverloadMethod {
	
	public static void main(String[]args)
	{
		Area a=new Area();
		System.out.println("Enter the rectangle length and width :");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int width=sc.nextInt();
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		
		System.out.println("raectangle area is :"+a.area1(length,width));
		System.out.println("Circle area is :"+a.area1(radius));
	}

}
