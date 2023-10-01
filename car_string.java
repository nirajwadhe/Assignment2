public class car_string {
	String car_name;
	String car_make;
	String car_model;
	int year;
	
	void setCar3(String car_name, String car_make, String car_model, int year) {
		this.car_name=car_name;
		this.car_make=car_make;
		this.car_model=car_model;
		this.year=year;
	}
	void getCar3() {
		System.out.println("Car name is: "+car_name);
		System.out.println("Car make is: "+car_make);
		System.out.println("Car model is: "+car_model);
		System.out.println("Year is: "+year);
	}
	public static void main(String args[]) {
		car_string c = new car_string();
		c.setCar3("KIA", "Toyota" , "G5" , 2005);
		c.getCar3();
	}
}
