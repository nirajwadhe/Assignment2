import java.util.Scanner;

public class Triangle {
	float a;
	float b;
	float c;
	float base;
	float height;
	
	void getdata(float a, float b, float c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	float peri() {
		float peri = a+b+c;
		return peri;
	}
	void getdata1(float base, float height) {
		this.base=base;
		this.height=height;
	}
	float area() {
		float area = (base*height)/2;
		return area;
	}
	public static void main(String args[]) {
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three sides: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		t.getdata(a, b, c);
		System.out.println("Perimeter is: "+t.peri());
		System.out.println("Enter the base and height: ");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		t.getdata1(base, height);
		System.out.println("Area is: "+t.area());
	}
}
