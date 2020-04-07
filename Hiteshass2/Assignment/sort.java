
public class sort{
	 

	public static void main(String[]args)
	{	
		int i,j,temp;
		int n=5;
		int arr[]={2,4,8,6,7};
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[j]=arr[i];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Sorted array :");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
