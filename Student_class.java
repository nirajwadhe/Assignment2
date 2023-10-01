import java.util.*;

public class Student_class {
	String name;
	int age;
	char grade;
	
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, age and grade of the student: ");
		name = sc.next();
		age = sc.nextInt();
		grade = sc.next().charAt(0);
	}
	
	void displaydata() {
		System.out.println("Details of the student is: \n");
		System.out.println("Name: "+name+"\nAge: "+age+"\nGrade: "+grade);
	}
	public static void main(String args[]) {
		Student_class s1 = new Student_class();
		s1.getdata();
		s1.displaydata();
		Student_class s2 = new Student_class();
		s2.getdata();
		s2.displaydata();
		Student_class s3 = new Student_class();
		s3.getdata();
		s3.displaydata();
	}
}
