package emp;
import java.util.*;

public class Employee{
		
	int emp_id;
	String emp_name;
	int year_exp;

	public void get(){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your emp_id");		
		emp_id = sc.nextInt();
		
		emp_name = sc.nextLine();

		System.out.println("Enter your Employee name:");
		emp_name = sc.nextLine();

		System.out.println("Enter number of years:");
		year_exp = sc.nextInt();
	} 
	
	public void display(){

	System.out.println("Emp_Id:" + emp_id + "\nEmp_Name:" + emp_name +
		"\nYear_Of_Exp:" + year_exp );
	} 
 
}

