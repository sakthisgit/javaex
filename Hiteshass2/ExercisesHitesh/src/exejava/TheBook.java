package exejava;
 class Book{
	 String name;
	 String author;
	 double price;
	 int qty;
	Book(String n,String a,double p,int q)
	{
		this.name=n;
		this.author=a;
		this.price=p;
		this.qty=q;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
}

public class TheBook {
	public static void main(String[]args)
	{
	Book b=new Book("DreamBook","Hitesh",20000,5);
	System.out.println(b);
	
	b.setName("Akshay ki kahani");
	b.setAuthor("Akshay");
	b.setPrice(100);
	b.setQty(1);
	
	System.out.println("Book name is :"+b.getName()+"\n"+"Author name is :"+b.getAuthor()+
			"\n"+"price is : "+b.getPrice()+"\n"+"qty is "+b.getQty());
	}
	

}
