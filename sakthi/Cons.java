import pkg1.*;
import pkg2.*;

class A{

          
     
    String name;
   int a;
   boolean t;

   public A(){
       this("sakthi");

   }

   public A(String name){
        this.name=name;

   }

    public void display(){
        
        System.out.println(this.name);
        System.out.println(a+"    "+t);
    }

    public static void myStaticMethod(){
        System.out.println("Static Method ");
    }
}


public class Cons {

     int varname=0;

    public  void test(){
        System.out.println(varname);
    }

    public static void main(String[] arg){
        A a= new A();
        a.display();

        A b =new A("saravanan");
        b.display();

        A.myStaticMethod();

        Cons c = new Cons();
        c.test();


        pkg1.PkgExample pkg =new pkg1.PkgExample();
        pkg.display();
;
       
        pkg2.PkgExample p2 = new pkg2.PkgExample()
        p2.display();

    }

}