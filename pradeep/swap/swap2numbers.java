package firstprj;

import java.util.Scanner;

public class swap2numbers
{
	static int num1;
	static int num2;
	static int temp;
	static Scanner read=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("number1:");
		 num1=read.nextInt();
		System.out.print("number2:");
        num2=read.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        
        System.out.println("after swaping");
        System.out.println("number1:"+num1);
        System.out.println("number2:"+num2);


        
	}

}
