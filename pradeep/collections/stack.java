import java.util.*;

class stack 
{
    public static void main(String[] args) 
{
        Stack<String> animals= new Stack<>();

        
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        
        String element = animals.peek();
        System.out.println("Element at top: " + element);
        
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position)

         boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}

