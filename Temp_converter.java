import java.util.Scanner;

public class Temp_converter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temp_celsius:");
        double x=sc.nextInt();
    	System.out.println("enter the temp_farhenheit:");
     	double y=sc.nextInt();
		System.out.println("enter 1) for farhenheit_celsius");
		System.out.println("enter 2) for celsius_farhenheit");
	    int z=sc.nextInt();
		Temp_converter check=new Temp_converter();
		switch(z) {
		case 1:
			check.C_F(x);
			break;
		case 2:
			check.F_C(y);
			break;
		}
	}
	
	public void C_F(double x) {
		double C = (x-32)*0.555555555;
		System.out.println(C);
	}
	public void F_C(double y) {
		double xy=(((y*9)/5)+32);
		System.out.println(xy);
	}
	
	




}
