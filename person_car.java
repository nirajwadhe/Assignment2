class person_car {
	String person_name;
	String car_name;
	
	void setdata(String person_name, String car_name) {
		this.person_name=person_name;
		this.car_name=car_name;
	}
	
	public static void main(String[] args) {
		person_car c = new person_car();
		
		c.setdata("toyota", "Creta");
		System.out.println("Person name is: "+c.person_name);
		System.out.println("Car's name is: "+c.car_name);
		
	}
}
