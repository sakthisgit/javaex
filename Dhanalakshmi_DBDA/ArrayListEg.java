import java.util.ArrayList;
public class ArrayListEg {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(23);
        al.add(45);
        al.add(87);
        al.add(12);

        System.out.println("size is: "+al.size());
        for (Integer n : al)
            System.out.println(n);

        al.remove(2);
        System.out.println("after removing");
        for(int i=0;i< al.size();i++)
            System.out.println(al.get(i));

        System.out.println(" String objects");
        String str1 = "Ragvi";
        String str2 = str1;

        ArrayList<String> str = new ArrayList<String>();
        str.add(str1);
        str.add(str2);
        System.out.println(str);


    }
}