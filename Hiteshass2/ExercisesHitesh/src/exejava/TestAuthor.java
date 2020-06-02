package exejava;
class Author
{
	private String name;
	private String email;
	private String gender;
	
	public Author(String n,String e,String gender)
	{
		this.name=n;
		this.email=e;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
}
public class TestAuthor {
	
	public static void main (String[]args)
	{
		Author A=new Author("Hitesh","hiteshsonar00@gmail.com","male");
		
		System.out.println(A);
		A.setName("Akshay");
		A.setEmail("akrane@1959.gmail.com");
		A.setGender("f");
		System.out.println("Name is :"+A.getName());
		System.out.println("Name is :"+A.getEmail());
		System.out.println("Name is :"+A.getGender());
	}

}
