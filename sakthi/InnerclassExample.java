class Outer{

    private void outerMethod(){
        System.out.println("Outer Class Method");
    }

     class Inner{
         public void display(){
            //outerMethod();
            System.out.println("Inner Class method");
        }
    }
}




public class InnerclassExample{
    public static void main(String[] args) {

       Outer outer = new Outer();
       Outer.Inner inner = outer.new Inner();
       inner.display();
    




        
    }

}