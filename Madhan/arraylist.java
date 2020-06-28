import java.util.ArrayList;
public class ArrayListEg {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        for (int n=0;n< al.size();n++)
            System.out.println(al.get(n));

        al.remove(0);
        System.out.println("after removing");
        for(int i=0;i< al.size();i++)
            System.out.println(al.get(i));
    }
}
