class InvalidEmpException extends Exception
{
    public InvalidEmpException(String s)
    {
        
        super(s);
    }
}
 
public class userdemo1
{
   void EmpCheck(String name) throws InvalidEmpException{
	if(name!="Hitesh" || name!="madan" || name!="Akshay"){
		throw new InvalidEmpException("Emp Invalid");
	}
	else
	{
		System.out.println("name was added in list");
	}
   }
   
    public static void main(String args[])
    {
    	userdemo1 obj = new userdemo1();
        try
        {
            obj.EmpCheck("Ak");
        }
        catch (InvalidEmpException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
