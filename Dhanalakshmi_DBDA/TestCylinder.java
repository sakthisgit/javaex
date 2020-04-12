/*Doubt: Does surface area of circle exists? 
         I mean even if height of cylinder = 0, Surface area is non-zero by formula.
         (2*PI*r*h) + (2*Area of circle)
*/
package NTU_EDU;

public class TestCylinder {
    public static void main(String[] args) {

        //1st Cylinder
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Area of base circle: "+c1.getCircleArea());
        System.out.println("Surface Area of Cylinder: "+c1.getArea());
        System.out.println("Volume of Cylinder: "+c1.getVolume());
        
        //2st Cylinder
        Cylinder c2 = new Cylinder(2.0);
        System.out.println(c2);
        System.out.println("Area of base circle: "+c2.getCircleArea());
        System.out.println("Surface Area of Cylinder: "+c2.getArea());
        System.out.println("Volume of Cylinder: "+c2.getVolume());
        
        //3st Cylinder
        Cylinder c3 = new Cylinder(2.0,3);
        System.out.println(c3);
        System.out.println("Area of base circle: "+c3.getCircleArea());
        System.out.println("Surface Area of Cylinder: "+c3.getArea());
        System.out.println("Volume of Cylinder: "+c3.getVolume());
        
        //4st Cylinder
        Cylinder c4 = new Cylinder(2.0,"Yellow",3.0);
        System.out.println(c4);
        System.out.println("Area of base circle: "+c4.getCircleArea());
        System.out.println("Surface Area of Cylinder: "+c4.getArea());
        System.out.println("Volume of Cylinder: "+c4.getVolume());
    }

}