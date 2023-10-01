import java.util.*;

public class Rectangle {
	double length, breadth;
	
	public static void cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle: ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double area = length*breadth;
		System.out.println("Area of the rectangle is; "+area);
	}
	
	public static void main(String[] args) {
		//Rect r = new Rect();
		cal();
	}
}
