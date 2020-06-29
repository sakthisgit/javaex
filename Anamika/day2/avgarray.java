public class avgarray{
public static void main(String[]args)
{
	int  sum=0;
	float avg;
	int arr[]={60,55,99,23,67};
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	avg=sum/arr.length;
	System.out.println("The average of given array is  :"+avg);
}

}
