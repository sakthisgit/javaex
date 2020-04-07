interface InterEx extends Inter2{
    public void displayinfo();
    int t=0;
}

interface Inter2{
    public void display();
}


public class InterfaceExample implements InterEx {

    public void displayinfo(){
        System.out.println("Interface Example");
    }

    public void display(){
        System.out.println("Interface2 Method");
    }

    public static void main(String[] args) {
        InterfaceExample inter = new InterfaceExample();
        inter.displayinfo();
    }

}