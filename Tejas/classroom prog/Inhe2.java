class Employee{
     String name;
    long salary;
    int dd;
    int mm;
    int yy;

    public Employee(){}


    public Employee(String n,long s, int dd,int mm, int yy){
        this.name= n;
        this.salary=s;
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public long salaryCompute(long inc){
        this.salary += this.salary * inc/100;
        return this.salary;
    }


    public void displayInfo(){
        System.out.println("Name "+ this.name);
        System.out.println("Hireday "+dd+"-"+mm+"-"+yy);
    }

    public void display(){
        System.out.println("Parent Class");
    }

}
 class Manager extends Employee{


        String addtional;

        public Manager(){}

        public Manager(String n,long s, int dd,int mm, int yy){
            //super(n,s,dd,mm,yy);
            addtional = "New Fields";
            name =n;

        }


        // Additional Method
        public void setBonus(){
            System.out.println("Bonus Created");
        }


        public long salaryCompute(long inc){
            this.salary += this.salary * inc/100 + (salary*20/100) ;
        return this.salary;
        }

        public void display(){
            System.out.println("Child Class");
        }


}


public class Inhe2 {
    public static void main(String... args){

        Manager m = new Manager("sakthi",10000,10,10,2012);
        m.displayInfo();
        System.out.println(m.salaryCompute(10));

        Employee emp = new Employee("sakthi",10000,10,01,1020);
        emp.displayInfo();
        System.out.println(emp.salaryCompute(10));



        Employee e = new Manager("sakthi",10,10,10,10);
        System.out.println(e.salaryCompute(10));
        e.displayInfo();



        //Narrowig casting
        m.setBonus();
        Employee e2 = m;  // Widening casting

        e2.display();
       

        Manager m2 = (Manager) e2; //Narrowing casting
        m2.setBonus();
        m2.display();

        
        
    }

}