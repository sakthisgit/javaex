package exejava;

public class TheTime {
	private int hh;
	private int mm;
	private int ss;
	public TheTime (int hh, int mm, int ss) {
		
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
	
	public int getHh() {
		return hh;
	}


	public void setHh(int hh) {
		this.hh = hh;
	}


	public int getMm() {
		return mm;
	}


	public void setMm(int mm) {
		this.mm = mm;
	}


	public int getSs() {
		return ss;
	}


	public void setSs(int ss) {
		this.ss = ss;
	}


	public void Date(int x,int y,int z)
	{
		System.out.println(x+":"+y+":"+z);
	}
	
	
	@Override
	public String toString() {
		return "TheTime [hh=" + hh + ", mm=" + mm + ", ss=" + ss + ", getHh()=" + getHh() + ", getMm()=" + getMm()
				+ ", getSs()=" + getSs() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
	
	public static void main(String[]args)
	{
		TheTime t=new TheTime(10,5,03);
		System.out.println(t);
		t.Date(5, 4, 19);
		t.setHh(18);
		t.setMm(56);
		t.setSs(01);
		System.out.println("Hours is :"+t.getHh());
		System.out.println("minuteis :"+t.getMm());
		System.out.println("second is :"+t.getSs());
		
	}

}


