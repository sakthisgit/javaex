abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

public class BookClass  {
    public static void main(String[] args)
    {
        Book  new_novel = new Book(){
                            void setTitle(String s)
                            {
                                this.title = s;
                            }};
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is: "+new_novel.getTitle());
    }
}