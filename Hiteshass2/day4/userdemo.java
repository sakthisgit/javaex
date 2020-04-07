class EmployeException extends Exception {

	String empname;
	EmployeException(String e)
	{
		this.empnname=e;
	}
	public String toString()
	{
		return "this name is not added in emp list : "+empname;
	}


}
//solve this one no ans came
public class uderdemo{

	public static void main(String[]args);
	
	String emp=new String[5];
	emp[0]="Hitesh";
	emp[1]="Akshay";
	emp[2]="madan";
	emp[3]="rupen";
	emp[4]="tejas";
	
	public void checking(arg[0]) throws EmployeException
	{
		for(int i=0;i<5;i++)
		{
			if(emp[i]=arg[0])
			{
				throw EmployeException;
			}
			else
			{
				System.out.println("Employee is preset");
			}
		}
	}

	
}
