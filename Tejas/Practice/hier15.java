class Shape{
	
	void Display(){
		
		System.out.println("");
	}	
}
class Circle extends Shape{

	int R;
	float Pi=3.14f;
	
	double C_area;
	
	Circle(){
		  
	}


	Circle(int r){
		R = r;
	}

	void dis(){
	
		C_area = Pi * R * R;
		System.out.println("Circle area:" + C_area);	
 	}
	
}


class Rectangle extends Shape{

	int l, w, R_area;

	Rectangle(){
		l = 10; 
		w = 10;
	}
	

	Rectangle(int L, int W){
		l = L; 
		w = W;
	}
	

	void dis(){
		
		R_area = l * w;
		System.out.println("Rectangle area:" + R_area);		
				
	}

}

class hier15{
	
	public static void main(String args[]){
		Circle c =new Circle(10);
		c.dis();
	
		Rectangle r = new Rectangle(1, 1);
		r.dis();
	}
}


 
