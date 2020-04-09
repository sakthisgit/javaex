class emp{
 String name;
 long salary;
 int dd;
 int mm;
 int yy;


 public emp(String name ,long salary,int dd,int mm,int yy)
 {
	 this.name=name;
	 this.salary=salary;
	 this.dd=dd;
	 this.mm=mm;
	 this.yy=yy;
 }
 public long salarycompute(long inc)
 {
	this. salary+=this.salary*inc/100;
	 return salary;
 }
}




 class manager extends emp{
	 
	 manager(String n,long sal,int dd,int mm,int yy)
	 {
		 super(n,sal,dd,mm,yy);
	 }
	public long salarycompute(long inc){
		this.salary+=this.salary*inc/100+(salary*20/100);
		return this.salary;
	}
	public void displayinfo()
	{
		System.out.println("name "+this.name);
		System.out.println("Hireday "+dd+"-"+mm+"-"+yy);
	}
}	





public class inherit1{
	public static void main(String[]args)
	{
		manager m=new manager("Hitesh",10000,12,02,2012);
		m.salarycompute(20);
		m.displayinfo();
	
	}
}
