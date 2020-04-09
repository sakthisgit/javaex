public class sum{
public static void main(String[]args)
{
	int  sum=0;
	double avg;
	int arr[]={20,20,20,20,20};
	for(int i=0;i<5;i++)
	{
		sum=sum+arr[i];
	}
	avg=sum*100/5;

	System.out.println("Total is :"+sum);
	System.out.println("Total average is :"+avg);
}

}
