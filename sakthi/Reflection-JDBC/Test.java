import java.lang.reflect.Method;
import java.lang.reflect.Field;

class Simple{

		public String name = "Test Variable";



	public void display(){
		System.out.print("Display Content");
	}


}


class Test{



		public static void main(String[] args){
		
			Simple inst1 = new Simple();

			try{
			Class c  = Class.forName("Simple");
			System.out.println(c.getName());

			Method[] method = c.getMethods();
			for(Method m :method){
				System.out.println(m);
			}
				System.out.println("*********************************************************");

			Field[] fields = c.getFields();
System.out.println("Size "+ fields.length);
			for(Field f: fields){
				System.out.println(f.getName());
				}

			}catch(ClassNotFoundException ex){}
		
		}

}
