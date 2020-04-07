
class Animal{

    public void animalProperty(){
        System.out.println("It has four legs on tail");
    }

    public void behavior(){
        System.out.println("making sound....");
    }
}

class Cat extends Animal{

    public void behavior(){
        System.out.println("Meow Meow");
    }

}

class Dog extends Animal{

    public void behavior(){
        System.out.println("Dog is barking");
    }

}



public class Inhe {

    public static void main(String... args){



        Cat c = new Cat();

        Dog d = new Dog();

        c.behavior();
        d.behavior();

        c.animalProperty();
        d.animalProperty();

    }

}