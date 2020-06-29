abstract class Myclass{
     public abstract void display();

public void display2(){
    System.out.println("Implemented Methods");
}

}


public class AbstractExample extends Myclass {

        public void display(){
            System.out.println("Abstarct Example");
        }

        public static void main(String[] args) {
            AbstractExample ab = new AbstractExample();
            ab.display();
            ab.display2();

        }

}