public class car_millage {
	int mileage;
	int fuel_level;
	
	void set_mileage(int mileage) {
		this.mileage=mileage;
	}
	void get_mileage() {
		System.out.println("Mileage is: "+mileage);
	}
	void set_fuel_level(int fuel_level) {
		this.fuel_level=fuel_level;
	}
	void get_fuel_level() {
		System.out.println("Fuel level is: "+fuel_level);
	}
	public static void main(String args[]) {
		car_millage cc = new car_millage();
		
		cc.set_fuel_level(45);
		cc.get_fuel_level();
		cc.set_mileage(55);
		cc.get_mileage();
	}
	
}
