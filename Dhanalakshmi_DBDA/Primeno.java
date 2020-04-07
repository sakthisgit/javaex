import java.util.*;
import java.lang.Math;
public class Primeno {
public static void main(String[] args)
{
    int prime_label =0;
    System.out.println("Prime numbers between 1 and 10,000");
    for(int i=1;i<=10000;i++)
    {
        if(i==2||i==3)
        {
            prime_label =1;
        }
        for(int x=2;x<= (int)Math.sqrt(i);x++)
        {
           
            if(i%x==0)
            {
                //System.out.println("--"+i+" "+(int)Math.sqrt(i)+" "+x);
                prime_label = 0;
                break;
            }
            else
            {
                prime_label = 1;
           }

        }
        if(prime_label == 1)
        System.out.println(i);
    }
}
}