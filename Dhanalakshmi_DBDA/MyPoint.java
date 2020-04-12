package NTU_EDU;

public class MyPoint {
    private int x,y;
    public MyPoint(){
        this.x =0;
        this.y =0;
    }
    public MyPoint(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int[] getXY() { int[] xy = {this.x,this.y}; return xy; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) { this.x = x; this.y =y; }

    public String toString() { return String.format("X="+this.x+", Y="+this.y);  }
    public double distance(int x1,int y1) {
        double dist = Math.sqrt(Math.pow((this.x - x1),2) + Math.pow((this.y-y1),2));
        return dist;
    }
    public double distance(MyPoint xy) {
        double dist = Math.sqrt(Math.pow((this.x - xy.getX()),2) + Math.pow((this.y-xy.getY()),2));
        return dist;
    }
    public double distance() {
        double dist = Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));  //distance from origin(0,0)
        return dist;
    }

}