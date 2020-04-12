package NTU_EDU;
import java.util.Scanner;

public class TestStudentStaff {
     public static void main(String[] args)
     {
         Student stu = new Student("Vimal","Chennai","DBDA",2020,1000.00,"CDAC");
         System.out.println(stu);

         Scanner sc = new Scanner(System.in);
         boolean isStaffEnough = false;
         while(!isStaffEnough)
         {
         int i = 0;
         String st_name = null;
         String st_addr = null;
         String st_school = null;
         double st_pay = 0;

         System.out.print("Enter staff details");
         System.out.print("\nEnter staff Name: ");
         st_name = sc.next();
         System.out.print("\nEnter staff Address: ");
         st_addr = sc.next();
         System.out.print("\nEnter staff School: ");
         st_school = sc.next();
         System.out.print("\nEnter staff Pay: ");
         st_pay = sc.nextDouble();
         System.out.println("Enter 1 to continue entering staff details(any other number will exit prompting)");
         isStaffEnough = (sc.nextInt() == 1) ? false : true;
         Staff[] stf;
         do
         {
         stf[i] = new Staff(st_name,st_addr,st_school,st_pay);
         }while(false);
         }
         //for(Staff sf : stf)
         //System.out.println(stf[0]); 
         sc.close();        
     }

}