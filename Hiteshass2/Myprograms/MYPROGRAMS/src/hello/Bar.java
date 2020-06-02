package hello;

public class Bar {
	private int id,price;
	private String name,type,company;
	
	public Bar(int id, int price, String name, String type, String company) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.type = type;
		this.company = company;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Bar [id=" + id + ", price=" + price + ", name=" + name + ", type=" + type + ", company=" + company
				+ "]";
	}
	
	
	
}
