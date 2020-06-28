import java.util.*;
class lowmark
{
	public static void main (String [] args)
	{
		int least_mark=0,index=0;
		String []names={"Kaviya","Navya","Divya","Rajesh","Vinod"};
		int []marks={80,76,85,92,89};
		int length=marks.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=1;j<length;j++)
			{
				if(marks[i]>marks[j])
				{
					if(least_mark==0)
					{
						least_mark=marks[j];
						index=j;
					}
					if(least_mark>marks[j])
					{
						least_mark=marks[j];
						index=j;
					}
				}
			}
		}
		System.out.println(names[index]);
	}
}
