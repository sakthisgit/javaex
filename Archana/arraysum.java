public class arraysum
{
	static int arr[]={10,19,67,33,5};
	static int sum()
	{	
		int sum=0;
		for(int i=0;i<arr.length;i++)
				
			sum=sum+arr[i];
			return sum;	
		}
	
	public static void main(String[]args)
	{
		
		System.out.println("Sum of array is :"+ sum());

	}

}
