import java.util.*;

public class car1 {
	String name;
	String model;
	int year;
	
	car1(){
		//System.out.println("\nEmpty class to just print\n");
	}
	car1(String name, String model){

		this.name = name;
		this.model = model;
		System.out.println("Name: "+name+"\nModel: "+model+"\n");
	}
	car1(String name, String model, int year){

		this.name = name;
		this.model = model;
		this.year = year;
		System.out.println("\nName: "+name+"\nModel: "+model+"\nYear: "+year);
	}
	
	void getdata() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		car1 c = new car1();
		System.out.println("Enter name and model: ");
		car1 c1 = new car1(sc.next(), sc.next());
		System.out.println("Enter name, model and year: ");
		car1 c2 = new car1(sc.next(), sc.next(), sc.nextInt());
	}

}
