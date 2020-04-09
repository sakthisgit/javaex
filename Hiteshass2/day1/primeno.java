
class fourth{

public static void main(String[]args)
	{
		int i,j,n;
		
		
		
		for(i=1;i<=10000;i++)
			{ 
				int temp=0;
				for(j=2;j<=i-1;j++)
				{
					if(i%j==0)
					{
						temp=temp+1;
					}
				}
			
				if(temp==0)
					{																				
						System.out.println(i);
					}
	
		}

	}


}
