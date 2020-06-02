package exejava;

public class Point {
	
	private int x;
	private int y;
	private int[] results;
	
	
	public Point(int x, int y) {
	
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public int[] getXY()
	{
		int results[]=new int[2];
		this.results[0]=this.x;
		this.results[1]=this.y;
		return results;
		
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	 public double distance(int x, int y) {
	      int xDiff = this.x - x;
	      int yDiff = this.y - y;
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
	 public static void main(String[]args)
	 {
		 Point p=new Point(4,4);
		 System.out.println(p);
		 
		 p.setX(5);
		 p.setY(9);
		 p.setXY(9, 10);
		 
		 System.out.println(" X value is : "+p.getX()+"\n"+"Y is :"+p.getY()+"\n"+"XY is :"+p.getXY()+"\n"+"Method is :"+p.distance(9,10));
	 }
	

}
