package exejava;

public class TheDate {
	private int dd;
	private int mm;
	private int yy;
	public TheDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public void Date(int x,int y,int z)
	{
		System.out.println(x+"-"+y+"-"+z);
	}
	
	
	@Override
	public String toString() {
		return "TheDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + ", getDd()=" + getDd() + ", getMm()=" + getMm()
				+ ", getYy()=" + getYy() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static void main(String[]args)
	{
		TheDate t=new TheDate(10,06,1998);
		System.out.println(t);
		t.Date(5, 4, 1998);
		t.setDd(6);
		t.setMm(12);
		t.setYy(1999);
		System.out.println("date is :"+t.getDd());
		System.out.println("date is :"+t.getMm());
		System.out.println("date is :"+t.getYy());
		
	}

}
