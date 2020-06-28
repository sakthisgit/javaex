/* 1.Doubt in line 13,14 - when book1.getAuthor() returns array, how to use the array object to call its getName() 
     Like book1.getAuthor()[0].getName()
     ERROR:
     "NTU_EDU\TestBook.java:12: error: cannot find symbol
     System.out.println("1st Author of the book: "+book1.getAuthor()[0].getName());
     symbol:   method getAuthor()
     location: variable book1 of type Book"
   2.Instead of creating Author array, how to assign 2 authors in the constructor of Book class itself.
     Like Book book1 =new Book("Python",{new Author("Wes McKinney","wesmckinney@gmail.com",'M'),new Author("McKinney","mckinney@gmail.com",'F')},auth,100.00);
     I tried this, but it is showing error.
     ERROR:
     NTU_EDU\TestBook.java:6: error: illegal start of type
     Book book1 = new Book("Python",{new Author("Wes McKinney","wesmckinney@gmail.com",'M')},100.00);
*/

import java.util.Scanner;
public class TestBook {
    public static void main(String[] args) {
        Author[] auth ={new Author("Wes McKinney","wesmckinney@gmail.com",'M'),new Author("McKinney","mckinney@gmail.com",'F')};
        Book book1 = new Book("Python",auth,100.00);
        System.out.println(book1);
        System.out.println("The Book details are as follows: \n");
        System.out.println("Book name: "+book1.getName());
        System.out.println("price of a book is: "+book1.getPrice());
        Author[] a = book1.getAuthors();
        System.out.println("1st Author of the book: "+a[0].getName());//book1.getAuthor().getName());
        System.out.println("2nd Author of the book: "+a[1].getName());//book1.getAuthor().getName());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of copies required: ");
        int quantity = sc.nextInt();

        book1.setQty(quantity);
        System.out.println("Total price of the books: "+(book1.getPrice() * book1.getQty()));
        sc.close();
    }

}