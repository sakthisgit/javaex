class Obj_count
{
    static int count = 0;
    Obj_count()
    {
        count++;
    }
    public void print_count()
    {
        System.out.println("No of objects created so far: "+count);
    }
}
public class Constructor1 {
    public static void main(String[] args)
    {
        Obj_count obj1 = new Obj_count();
        obj1.print_count();
        Obj_count obj2 = new Obj_count();
        obj2.print_count();
        Obj_count obj3 = new Obj_count();
        obj3.print_count();

    }

}