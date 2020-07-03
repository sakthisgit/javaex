import java.util.ArrayList;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Documented
@Target(ElementType.METHOD) //TYPE, METHOD, CONSTRUCTOR, FIELD
@Inherited
@Retention(RetentionPolicy.RUNTIME)//SOURCE, CLASS and RUNTIME
@interface MethodInfo{
String author() default "sakthi";
String date();
int revision() default 1;
String comments();
}

class Newclass{

@MethodInfo(author="sakthi", date="03-07-2020", comments="display Method")
public void display(){
	
		System.out.println("Deprecated Method");
	}


}
public class SuExample{

	//@NV(max=20)
	String name;

	
	@SuppressWarnings("unchecked")
	public static void main(String... a){
		Newclass s = new Newclass();
		s.display();
		
	}
}
