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

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
public class Test_Author {
	public static void main (String[]args)
	{
		Author obj1=new Author("kirti","ambikekirti@gmail.com","f");
		
	System.out.println(obj1);
		obj1.setName("vibha");
		obj1.setEmail("vibha@gmail.com");
		obj1.setGender("f");
		System.out.println("Name is :"+obj1.getName());
		System.out.println("Name is :"+obj1.getEmail());
		System.out.println("Name is :"+obj1.getGender());
	}
}
