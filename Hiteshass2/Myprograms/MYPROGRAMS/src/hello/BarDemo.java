package hello;

import java.util.Scanner;

public class BarDemo {
	public static void main(String[]args)
	{
		int id,price;
		String name,type,company;
		Bar b[]=new Bar[10];
		Scanner sc=new Scanner(System.in);
		int choice,count=0;
		while(true)
		{
			System.out.println("Welcome to Atul Deshi/Bear/Whisky Bar");
			System.out.println("1.Add Stock");
			System.out.println("2.Update Stock");
			System.out.println("3.get Stock info by id");
			System.out.println("4.Remove Stock info");
			System.out.println("5.Get list Stock");
			System.out.println("6.get list by type of Drink");
			System.out.println("7.exit");

			System.out.println("Enter your Choice");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Add the information came stocks");
				System.out.println("How many number of records you want to add");
				int ch=sc.nextInt();
				for(int i=0;i<ch;i++)
				{
					System.out.println("Enter Stock id :");
					id=sc.nextInt();
					System.out.println("Enter this stock price :");
					price=sc.nextInt();
					System.out.println("Enter the Stock Brandname :");
					name=sc.next();
					System.out.println("Enter the type of Drink :");
					type=sc.next();
					System.out.println("Enter the Brand company name :");
					company=sc.next();

					b[i]=new Bar(id,price,name,type,company);
					count++;
				}break;
			case 2:
				if(b[0]!=null)
				{
					System.out.println("Enter Stock id for update information ");
					id=sc.nextInt();

					for(int i=0;i<=count;i++)
					{
						if(b[i]!=null && b[i].getId()==id)
						{
							System.out.println("Enter this stock price :");
							price=sc.nextInt();
							System.out.println("Enter the Stock Brandname :");
							name=sc.next();
							System.out.println("Enter the type of Drink :");
							type=sc.next();
							System.out.println("Enter the Brand company name :");
							company=sc.next();

							b[i].setPrice(price);
							b[i].setName(name);
							b[i].setType(type);
							b[i].setCompany(company);
						}else
							if(i>count)
							{
								System.out.println("id is not found");
							}
					}
				}else
				{
					System.out.println("Record not Found");
				}break;
			case 3:
				if(b[0]!=null)
				{
					System.out.println("Enter Stock id for get information ");
					id=sc.nextInt();

					for(int i=0;i<=count;i++)
					{
						if(b[i]!=null && b[i].getId()==id)
						{
							System.out.println(b[i]);
						}
						else
							if(i>count)
							{
								System.out.println("id is not found");
							}
					}
				}else
				{
					System.out.println("Record not Found");
				}break;
			case 4:
				if(b[0]!=null)
				{
					System.out.println("Enter Stock id for Remove information ");
					id=sc.nextInt();

					for(int i=0;i<=count;i++)
					{
						if(b[i]!=null && b[i].getId()==id)
						{
							b[i]=null;
						}
						else
							if(i>count)
							{
								System.out.println("id is not found");
							}
					}
				}else
				{
					System.out.println("Record not Found");
				}break;
			case 5:
				if(b[0]!=null)
				{
					for(int i=0;i<=count;i++)
					{
						System.out.println(b[i]);
					}
				}
				else
				{
					System.out.println("Record not found");
				}break;
			case 6:
				if(b[0]!=null)
				{
					System.out.println("Enter Type of Brand for get information ");
					type=sc.next();

					for(int i=0;i<count;i++)
					{
						if(b[i]!=null && b[i].getType()==type)
						{
							System.out.println(b[i]);
						}
						else
							if(i>count)
							{
								System.out.println("Type is not found");
							}
					}
				}else
				{
					System.out.println("Record not Found");
				}break;
			case 7:
				System.out.println("Thank you");
				System.exit(0);
				break;

			default :
				System.out.println("invalid choice");



			}
		}
	}
}
