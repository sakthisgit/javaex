class date {
	private int dd;
	private int mm;
	private int yy;
	public date(int dd, int mm, int yy) {
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

	
	public String toString() {
		return "TheDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
}
	public class Date {
		
	
	public static void main(String[]args)
	{
		date d=new date(05,10,1995);
		System.out.println(d);
		System.out.println();
		System.out.println("Setting Date :");
		d.setDd(8);
		d.setMm(11);
		d.setYy(2016);
		System.out.println(d);

	}

}
