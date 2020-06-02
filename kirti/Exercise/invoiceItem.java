public class invoiceItem {
	private int id;
	private String desc;
	private int qty;
	private int unitprice;
	public invoiceItem(int id, String desc, int qty, int unitprice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitprice = unitprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	public String toString() {
		return "Invoice_item [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitprice=" + unitprice + "]";
	}

	public static void main(String[]args)
	{
		invoiceItem i=new invoiceItem(101,"pen",12,100);
		System.out.println(i);

		i.setId(101);
		System.out.println("id is :"+i.getId());
		i.setDesc("pencil");
		System.out.println("id is :"+i.getDesc());
		i.setQty(30);;
		System.out.println("id is :"+i.getQty());
		i.setUnitprice(30);;
		System.out.println("id is :"+i.getUnitprice());

	}
}
