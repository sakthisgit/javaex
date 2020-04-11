package NTU_EDU;

public class TestAuthor {
public static void main(String[] args)
{
    Author[] auths = {new Author("Wes McKinney","wesmckinney@gmail.com",'M'),new Author("McKinney","mckinney@gmail.com",'F')};
    System.out.println(auths);
    //1st Author information
    System.out.println("The Author is: "+auths[0].getName());
    System.out.println("The Author's mail id is: "+auths[0].getEmail());
    System.out.println("The Author's gender is: "+auths[0].getGender());
    //2nd Author information
    System.out.println("The Author is: "+auths[1].getName());
    System.out.println("The Author's mail id is: "+auths[1].getEmail());
    System.out.println("The Author's gender is: "+auths[1].getGender());
}

}