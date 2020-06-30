
public class sorting{
	 

	public static void main(String[]args)
	{	
		int arr[]={8,6,5,9,7};
		int temp=0;
		System.out.println("orignal  array element ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + "");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[j]=arr[i];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Sorted array in ascending order........:");
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
	}
}
