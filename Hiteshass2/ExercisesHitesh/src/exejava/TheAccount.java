package exejava;

public class TheAccount {
	private String name;
	private int id;
	private double balance=0;
	int amount=5000;
	public TheAccount(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public double credit(int x)
	{
		System.out.println("the amount is :"+amount);
		this.balance=amount+x;
		return balance;
	}
	
	public double debit(int x)
	{
		System.out.println("the amount is :"+amount);
		this.balance=amount-x;
		return balance;
	}
	
	
	
	@Override
	public String toString() {
		return "TheAccount [name=" + name + ", id=" + id + ", balance=" + balance + ", amount=" + amount
				+ ", getName()=" + getName() + ", getId()=" + getId() + ", getBalance()=" + getBalance() + "]";
	}
	public static void main(String[]args)
	{
		TheAccount t=new TheAccount("Hitesh",101,0);
		System.out.println(t);
		System.out.println("the amount credit :"+t.credit(5000));
		System.out.println("the amount credit :"+t.debit(2000));
	}

}
