class Circle{

	int radius;
	String color;
	
	Circle(){
		radius = 2;
		color = "green";
	}
	
	Circle(int Radius, String Color){
		radius = Radius;
		color = Color;
	}

	public void area(){
		double area;
		double pi = 3.14;
		area = pi * radius * radius; 
		System.out.println("Area is:" +area);
	}


}

class inhe13{

	public static void main(String args[]){
		Circle c = new Circle();
		Circle c1 = new Circle(10, "Blue");
		c.area();
		c1.area();
	}

}
