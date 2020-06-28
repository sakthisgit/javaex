import java.util.*;

class prime5{
public static void main(String args[]){
	int n, i, flag=0;

	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter number:");
	n = sc.nextInt();
	
	for(i=2; i<n; i++){
		if(n%i==0){
			flag=1;
			break;
		}
	}
	if(flag==1)
		System.out.println("not a prime number");
	else
		System.out.println("prime number");
}} 
