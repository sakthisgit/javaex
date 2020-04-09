package cdac;

public class Arraysum {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
         System.out.println("the sum of the array is: "+sum );
	}

}
