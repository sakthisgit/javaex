package NTU_EDU;

public class TestMyPoint {
public static void main(String[] args)
{
    MyPoint p1 = new MyPoint(1,2);     //Calling empty constructor.
    MyPoint p2 = new MyPoint(7,6);  //Calling arugumental constructor.
    System.out.println(p1);
    System.out.println(p2);

    //System.out.println("Distance between ("+p1.getX()+","+p1.getY()+") is "+p1.dis
    System.out.println("Distance is "+p1.distance());   //distance from origin(0,0)
    System.out.println("Distance is "+p1.distance(p2));
    System.out.println("Distance is "+p1.distance(3,4));
}

}