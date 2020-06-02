package practice;

public class SubstractException extends Exception {
	
	int a;

	public SubstractException(int a) {
		//super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "SubstractException [this first value is" + a + "less the second value]";
	}
	
	
	

}
