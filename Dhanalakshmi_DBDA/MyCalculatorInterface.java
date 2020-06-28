import java.util.Scanner;

interface AdvancedArithmetic
{
    public int divisior_sum(int n);
}
public class MyCalculatorInterface implements AdvancedArithmetic {
    public int divisior_sum(int n)
    {
        int count = 0;
        int i = 1;
       while(i<= n)
       {
           if (n%i == 0) 
           count++;
           i++;
       }
        int[] div = new int[count];
        int sum_div = 0;
        count = 0;
        System.out.println("Divisors are ");
        for(int j = 1;j<= n;j++)
        {
            if (n%j == 0) 
            {
            div[count++] = j ;
            sum_div += j;
            System.out.println(j);
            }
        } 
        return sum_div;
    }

    public static void main(String[] args)
    {
        MyCalculatorInterface myi = new MyCalculatorInterface();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number within 1000: ");    
        int n = sc.nextInt();
        int sum_n = myi.divisior_sum(n);
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum_n);
        sc.close();
    }
}