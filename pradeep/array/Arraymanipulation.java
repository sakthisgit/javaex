package firstprj;
import java.util.*;

public class Arraymanipulation 
{
	public int average(int [] arr)
	{
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("the sum of array is "+sum);
		avg= sum/arr.length;
		return avg;
	}
	public int[] printarray(int [] arr)
	{
		 for(int i=0;i<arr.length;i++) 
				
			{
				System.out.println("Element at index " + i +   " : "+ arr[i]);
			}
		 return arr;
	}
    public void sort(int [] arr)
    {
    	int temp=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr.length;j++)
    		{
    			if(arr[i]<arr[j])
    			{
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    
    }
	public static void main(String[] args) 
	{
		float average=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elemnts in array:");
		int num=sc.nextInt();
		int [] a=new int[num] ;
		System.out.println("enter the elements of array:");
		for(int i=0;i<num;i++) 
			
		{
			a[i]=sc.nextInt();
		}
      
       
       Arraymanipulation m=new  Arraymanipulation();
       m.printarray(a);
       m.sort(a);
        
        System.out.println("after sorting:");
        m.printarray(a);
        average=m.average(a);
        System.out.println("the average of array :"+average);

	}

}
