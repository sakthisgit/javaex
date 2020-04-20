package practice;

import java.util.StringJoiner;

public class StringJoinerdemo {

	public static void main(String[]args)
	{
		StringJoiner joiner=new StringJoiner(":");
		joiner.add("java");
		joiner.add("java");
		joiner.add("java");
		joiner.add("java");
		System.out.println(joiner);

		StringJoiner joiner1=new StringJoiner(":",";",".");
		joiner1.add("java");
		joiner1.add("java");
		joiner1.add("java");
		joiner1.add("java");
		System.out.println(joiner1);
		
		StringJoiner joiner2=joiner1.merge(joiner);
		System.out.println(joiner2);
	}
}
