import java.util.*;

class student{
	int r_no, mark1, mark2, mark3, mark4, mark5, total;
	float average;
	String name;
	
	student(){
			
		r_no = 1;
		mark1 = 80;mark2 = 80;mark3 = 80; mark4 = 80; mark5 = 80;
		name = "ram";

	}
	student(int R_no, String Name,  int Total, float Average){
		r_no = R_no;
		name = Name;
		total = Total;
		average = Average;
		
		System.out.println("\nConstructor with parameters:\n" + "Roll_No: " + r_no 
		+ "\nname: " + name + "\ntotal:" + total + "\nAverage:" + average);	
	}
	void get(){

		total = mark1 + mark2 + mark3 + mark4 + mark5;
		average= total/5;
		System.out.println("Roll_No: " + r_no + "\nname: " + name + "\ntotal:" + total + "\nAverage:" + average);	

	}

	void get(int R_no, String Name,  int Total, float Average){
		r_no = R_no;
		name = Name;
		total = Total;
		average = Average;
		System.out.println("Roll_No: " + r_no + "\nname: " + name + "\ntotal:" + total + "\nAverage:" + average);	
	}

}

class student12_const{
	public static void main(String args[]){
		student s1 = new student();
		student s2 = new student(3, "anabella", 500, 100);
		System.out.println("\nFunction without parameters:");
		s1.get();
		
		System.out.println("\nFunction with parameters:");
		
		int r_no, mark1, mark2, mark3, mark4, mark5, total, average;
		String name;		

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter roll_no:");
		r_no = sc.nextInt();
		sc.nextLine();

                System.out.print("Enter Name:");
		name = sc.nextLine();

                System.out.print("Enter 5 Subject Marks:");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
		mark4 = sc.nextInt();
		mark5 = sc.nextInt();

		total = mark1 + mark2 + mark3 + mark4 + mark5;
		average = total/5; 
		s1.get(r_no, name, total, average);


	}
}
