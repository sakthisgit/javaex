public class Sample
{
    public static void main(String[] args)
    {
        try{
        String str = null;
        System.out.println(str.length());
        }
       /* catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Null string exception");
        }*/
        finally
        {
            System.out.println("Without catch");
        }
    }
}