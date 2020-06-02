package hello;

import java.util.Scanner;

public class MedicineDemo {

		public static void main(String[]args)
		{
			 int medId,price;
			 String medName,DiseaseType,expDate,Company;
			 Medicine med[]=new Medicine[10];
			 Scanner sc=new Scanner(System.in);
			 int count=0,choice;
			 
			 while(true)
			 {
				 System.out.println("Welcome to medical");
				 System.out.println("1.Add medicine");
				 System.out.println("2.Update medicine");
				 System.out.println("3.Get medicine by Id");
				 System.out.println("4.delete medicine");
				 System.out.println("5.get list of medicine");
				 System.out.println("6.get medicine by DiseaseType");
				 System.out.println("7.Exit");
				 
				 System.out.println("Enter your Choice");
				 choice=sc.nextInt();
				 
				 switch(choice)
				 {
				 case 1:
					 System.out.println("How many number of records you want to add");
					 int ch=sc.nextInt();
					 for(int i=0;i<ch;i++)
					 {
						 System.out.println("Enter Medicine id :");
						 medId=sc.nextInt();
						 System.out.println("Enter the price :");
						 price=sc.nextInt();
						 System.out.println("Enter Expdate :");
						 expDate=sc.next();
						 System.out.println("Enter the diseaseType :");
						 DiseaseType=sc.next();
						
						 System.out.println("Enter the company name :");
						 Company=sc.next();
						 System.out.println("Enter Medicine name :");
						 medName=sc.next();
						 
						 
						 med[i]=new Medicine(medId,price,expDate,DiseaseType,Company,medName);
						 count++;
					 }break;
				 case 2:
					 if(med[0]!=null)
					 {
						 System.out.println("Enter the medicine id for update :");
						 medId=sc.nextInt();
						 
						 for(int i=0;i<count;i++)
						 {
							 if(med[i]!=null && med[i].getMedId()==medId)
							 {
								 System.out.println("Enter the price :");
								 price=sc.nextInt();
								 System.out.println("Enter the diseaseType :");
								 DiseaseType=sc.next();
								 System.out.println("Enter Expdate :");
								 expDate=sc.next();
								 System.out.println("Enter the company name :");
								 Company=sc.next();
								 System.out.println("Enter Medicine name :");
								 medName=sc.next();
								 
								 med[i].setPrice(price);
								 med[i].setDiseaseType(DiseaseType);
								 med[i].setExpDate(expDate);
								 med[i].setCompany(Company);
								 med[i].setMedName(medName);
							 }
							 else
							 {
								 if(i>count)
								 {
									 System.out.println("id is not found");
								 }
							 }
						 }
						 
					 }else
					 {
						 System.out.println("Record not found");
					 }break;
				 case 3:
					 if(med[0]!=null)
					 {

						 System.out.println("Enter the medicine id for search :");
						 medId=sc.nextInt();
						 
						 
						 for(int i=0;i<count;i++)
						 {
							 if(med[i].getMedId()==medId)
							 {
								 System.out.println(med[i]);
							 }else
							 {
								 if(i>count)
								 {
									 System.out.println("Record not found");
								 }
							 }
						 }
					 }else
					 {
						 System.out.println("Record not found");
					 }break;
				 case 4:
					 if(med[0]!=null)
					 {

						 System.out.println("Enter the medicine id for DELETE info:");
						 medId=sc.nextInt();
						 
						 
						 for(int i=0;i<count;i++)
						 {
							 if(med[i].getMedId()==medId)
							 {
								 med[i]=null;
							 }else
							 {
								 if(i>count)
								 {
									 System.out.println("Record not found");
								 }
							 }
						 }
					 }else
					 {
						 System.out.println("Record not found");
					 }break;
				 case 5:
					 if(med[0]!=null)
					 {
						 
						 for(int i=0;i<count;i++)
						 {
							 System.out.println(med[i]);
						 }
					 }
					 else
					 {
						 System.out.println("Record not found");
					 }break;
				 case 6:
					 if(med[0]!=null)
					 {

						 System.out.println("Enter the  DiseaseType for search medicine :");
						 DiseaseType=sc.next();
						 
						 
						 for(int i=0;i<count;i++)
						 {
							 if(med[i].getDiseaseType()==DiseaseType)
							 {
								 System.out.println(med[i]);
							 }else
							 {
								 if(i>count)
								 {
									 System.out.println("Record not found");
								 }
							 }
						 }
					 }else
					 {
						 System.out.println("Record not found");
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
