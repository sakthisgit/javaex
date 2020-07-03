@FunctionalInterface
interface Drawable{
public void draw();
}

public class Example{
	public static void main(String... a){
		int width = 10;

		Drawable d2 = ()->{
				System.out.print("Widht"+width);
		};
	
		d2.draw();
}
}
