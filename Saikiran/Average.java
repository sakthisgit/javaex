package cdac;

public class Average {

	public static void main(String[] args) {
		 int sum=0;
		 double avr;
		 int arr[]= {12,14,15,16,17,18};
		 int n=arr.length;
		 for(int i=0;i<n;i++)
         {
        	 sum+=arr[i];
         }
		 avr=sum/n;
		 System.out.println("The average is:"+avr);
	}

}
