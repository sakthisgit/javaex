import java.util.ArrayList;
public class ArrayListEg {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        for (int n=0;n< al.size();n++)
            System.out.println(al.get(n));

        al.remove(0);
        System.out.println("after removing");
        for(int i=0;i< al.size();i++)
            System.out.println(al.get(i));
    }
}
