package practice;

public class Medicine {
		private int id,price;
		private String name;
		
	public Medicine(int id, int price, String name) {
			
			this.id = id;
			this.price = price;
			this.name = name;
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void display()
		{
			System.out.println("Id is :"+id+"\n"+"Price is :"+price+"\n"+"name is :"+name);
		}
		
		public static void main(String[]args)
		{
			Medicine m=new Medicine(1,20,"parasitamol");
			m.display();
			m.setId(15);
			m.setName("Crocine");
			m.setPrice(25);
			
			System.out.println("Id is "+m.getId()+"name is "+m.getName()+"price is "+m.getPrice());
			
		}

		
		
		
		

}
