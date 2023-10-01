import java.util.*;

public class Race_car {
	double car_speed, car_speed1;
		
	void setdata(double car_speed, double car_speed1 ) {
		this.car_speed=car_speed;
		this.car_speed1=car_speed1;
	}
	void race() {
		if(car_speed>car_speed1) {
			System.out.println("Car1 is faster than Car2!");
		}
		else
			System.out.println("Car2 is faster than Car1!");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the speed of car1: ");
		double car_speed =sc.nextDouble();
		System.out.print("Enter the speed of car2: ");
		double car_speed1 =sc.nextDouble();
		Race_car rc = new Race_car();
		rc.setdata(car_speed, car_speed1);
		rc.race();
	}
	
}
