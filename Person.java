import java.util.*;

public class Person {
	String name;
	int age;
	String gender;
	
	void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, age and gender of the person:");
		name = sc.nextLine();
		age = sc.nextInt();
		gender = sc.next();
	}
	void display() {
		System.out.println("\nName: "+name+ "\nAge: "+age+ "\nGender: "+gender);
		
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.info();
		p.display();
	}

}
