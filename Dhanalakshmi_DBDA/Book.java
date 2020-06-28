
import java.lang.*;
public class Book {
    private String name;
    private double price;
    private int qty = 0;
    private Author[] authors;
    public Book(String name,Author[] authors,double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name,Author[] authors,double price,int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        String auth_string =new String();
        int i = 1;
        for(Author auth:authors) {
            auth_string += String.valueOf(i)+"."+ auth+"\n";
            i++;
        }
        return String.format("Book name: "+this.name+", Price: "+this.price+", Author: "+auth_string);
        //return String.format("Book name: "+this.name+", Price: "+this.price+", Quantity: "+this.qty+", Author: "+super.toString());
    }
}