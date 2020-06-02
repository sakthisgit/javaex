package practice;

public class ForEach2 {
	public static void main(String[]args)
	{
		int add=0;
		int arr[]= {2,5,6,8,9};
		for(int i:arr)
		{
			add=add+i;
		}
		System.out.println(add);
	}
}
