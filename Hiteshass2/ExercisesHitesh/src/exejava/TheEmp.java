package exejava;

public class TheEmp {
		private int id;
		private String Firstname;
		private String Lastname;
		private double salary;
		
		TheEmp()
		{
			
		}

		public TheEmp(int id, String firstname, String lastname, double salary) {
			super();
			this.id = id;
			Firstname = firstname;
			Lastname = lastname;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return Firstname;
		}

		public void setFirstname(String firstname) {
			Firstname = firstname;
		}

		public String getLastname() {
			return Lastname;
		}

		public void setLastname(String lastname) {
			Lastname = lastname;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "TheEmp [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", salary=" + salary
					+ "]";
		}
		
		public double Annualsal()
		{
			return 12*salary;
		}
		
		public static void main(String[]args)
		{
			TheEmp t=new TheEmp();
			System.out.println(t);
			TheEmp s=new TheEmp(1,"Hitesh","Sonar",5200);
			System.out.println(s);
			
			s.setId(2);
			s.setFirstname("Akshay");
			s.setLastname("Rane");
			s.setSalary(20000);
			
			System.out.println("The fname is :"+s.getFirstname()+"\n"+"the last name :"+s.getLastname()+"\n"+"salary is :"+s.getSalary());
			System.out.println("The annual salary is :"+s.Annualsal());
			
			
		}

}
