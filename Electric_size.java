import java.util.*;

class Car {
	String name;
	String make;
	String model;
	void setdata(String name, String make, String model) {
		this.name=name;
		this.make=make;
		this.model=model;
	}
	void getdata() {
		System.out.println("Name is: "+name);
		System.out.println("Make is: "+make);
		System.out.println("Model is: "+model);
	}
}
public class Electric_size extends Car{
	int batterysize;

	public static void main(String args[]) {
		Electric_size ec = new Electric_size();
		ec.batterysize=60;
		System.out.println("Battery size is: "+ec.batterysize);
		ec.setdata("Creta", "Hyndai", "SX");
		ec.getdata();	
	}
}
