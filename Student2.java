import java.util.*;

public class Student2 {
	int rollno;
	String phoneno;
	String address;
	
	void setStudent2(int rollno, String phoneno, String address) {
		this.rollno = rollno;
		this.phoneno = phoneno;
		this.address = address;
	}
	void display() {
		System.out.println("Roll no. is: "+rollno);
		System.out.println("Phone is: "+phoneno);
		System.out.println("Address is: "+address);
	}
	public static void main(String args[]) {
		Student2 sam = new Student2();
		sam.setStudent2(23,"1256347890", "latur, Maharashtra.\n");
		sam.display();
		Student2 john = new Student2();
		john.setStudent2(33,"545484313", "jalgaon, Maharashtra.");
		john.display();
	}
}
