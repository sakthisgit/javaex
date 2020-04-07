import java.util.Arrays;
class Array_handling
{
    float sum_value = 0;
    float avg_arr = 0;
    public void print_arr(float[] ar,int n)
    {
        for(int i=0;i < n;i++)
        System.out.println("Input values are "+ar[i]);
    }
    public float sum_arr(float[] args,int n)
    {
        for(int i=0;i<n;i++)
        {
            sum_value += args[i];
        }
        return this.sum_value;
    }
    public float avg_arr(int n)
    {
        this.avg_arr = this.sum_value/n;
        return this.avg_arr;
    }
}
public class Array_ex {
public static void main(String[] args)
{
Array_handling ah = new Array_handling();
float[] arr1 = new float[args.length];
System.out.println("Array length is: "+args.length);
for(int i=0;i< args.length;i++)
{
   arr1[i] = Float.parseFloat(args[i]);
}
ah.print_arr(arr1,args.length);
System.out.println("The sum is: "+ah.sum_arr(arr1,args.length));
System.out.println("The avg is: "+ah.avg_arr(args.length));
}
}