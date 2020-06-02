package cdac;

public class Overloading {
	static int add() {
		int a=10;
		return a;
	}
	static int add(int a) {
		return a+a;
	}
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(Overloading.add());
		System.out.println(Overloading.add(20));
		System.out.println(Overloading.add(20,30));
		System.out.println(Overloading.add(30,20,10));
	}

}
