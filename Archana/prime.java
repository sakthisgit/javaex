
class prime{

public static void main(String[]args)
	{
	   for(int i=1;i<=10000;i++)
		{
	          int count=0;
		  for( int j=2;j<=i-1;j++)
		     {
			if(i%j==0)
			 {
				count=count+1;
			 }
	             }
		 if(count==0)
		{			    		    				    		                  				System.out.print("\t" + i);
		
		}
		}
	}
}
