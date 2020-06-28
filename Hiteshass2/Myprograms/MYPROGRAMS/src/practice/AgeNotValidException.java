package practice;

public class AgeNotValidException extends Exception {
	int age;
	
	AgeNotValidException(int a)
	{
		this.age=a;
	}

	@Override
	public String toString() {
		return "AgeNotValidException [Age is " + age + "less than 18 not valid]";
	}

}
