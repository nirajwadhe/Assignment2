

import java.util.*;

public class car_class {
	String make;
	String model;
	int year;
	
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the make, model and year of the car: ");
		make = sc.next();
		model = sc.next();
		year = sc.nextInt();
	}
	void displaydata() {
		System.out.println("The details of the car are as follows: \nMake: "+make+"\nModel: "+model+"\nYear: "+year);
	}

	 public static void main(String[] args) {
		 car_class c = new car_class();
		 c.getdata();
		 c.displaydata();
		 c.start_engine();
	 }
	 
	 
	 public class car{
		 public void start_engine() {
			 System.out.println("engine started");
		 }
	 }
	 void start_engine() {
		 System.out.println("engine started");
	 }
 }
