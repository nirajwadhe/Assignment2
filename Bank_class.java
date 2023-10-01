import java.util.*;

public class Bank_class {
	int account_number; 
	String account_holder; 
	double balance;
	
	void getdata() {
		System.out.println("Enter the bank account number, account holder name and the balance amount:");
		Scanner sc = new Scanner(System.in);
		account_number = sc.nextInt();
		account_holder = sc.next();
		this.balance = sc.nextDouble();
	}
	
	void displaydata() {
		System.out.println("Account number is: "+account_number);
		System.out.println("Account name is: "+account_holder);
		System.out.println("Initial balance is: "+balance);	
	}
	
	public static void main(String args[]) {
		Bank_class b1 = new Bank_class() ;
		b1.getdata();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1) Deposit: ");
		System.out.println("2) Withdrawal: ");
		int c = s1.nextInt();
		
		switch(c) {
		case 1: 
			double amount = s1.nextDouble();
			double result = b1.balance + amount;
			System.out.println("New balance is: "+result);
			break;
		
		case 2: double amount1 = s1.nextDouble();
		double result1 = b1.balance - amount1;
		System.out.println("New balance is: "+result1);
		break;
		}
		
	}
}
