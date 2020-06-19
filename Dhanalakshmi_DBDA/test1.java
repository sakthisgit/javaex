import java.util.Scanner;

public class test1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int no = sc.nextInt();
        String names[] = new String[no];
        int marks[] = new int[no];
        String nameOfStudent = null;
        int min_marks = 0;
        for(int i =0;i<no; i++)
        {
            System.out.print("Enter name of the student "+ (i+1)+": ");
            names[i] = sc.next();
            System.out.print("Enter marks:");
            marks[i] = sc.nextInt();
        }
        min_marks = marks[0];
        nameOfStudent = names[0];
        for(int i=1;i<no;i++)
        {
            if (min_marks > marks[i])        
            {
            min_marks = marks[i];
            nameOfStudent = names[i];
            }
        }    
        sc.close();
        System.out.println("Name of the student with minimum marks: "+nameOfStudent);
        System.out.println("Marks: "+min_marks);
    }
}