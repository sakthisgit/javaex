import java.util.Scanner;

class MyCalculator{
    public long power(int n, int p) throws Exception
    {
            if ((n<0) || (p<0))
            throw new Exception("n or p should not be negative");
            else if ((n==0) && (p==0))
            throw new Exception("n and p should not be zero");
            return (long) Math.pow(n, p);
        
    }
}

public class Calculator_Exception {
    public static void main(String[] args)
    {
       MyCalculator mycalc = new MyCalculator();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n in nPOWERp. Please enter within the range(-10,10): ");
       int n = sc.nextInt();
       System.out.print("Enter the value of p in nPOWERp. Please enter within the range(-10,10): ");
       int p = sc.nextInt();
       try{
       long powValues = mycalc.power(n,p);
       System.out.println("Result is: "+powValues);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       sc.close();
    }
}