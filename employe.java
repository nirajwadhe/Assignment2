import java.util.Scanner;

public class employe {
int year_of_joining;
String name;
int salary;
String address;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numemp=numobj();
		employe[] e=new employe[numemp];
		for (int i=0;i<numemp;i++) {
			e[i]=new employe();
		}
		for (int i=0;i<numemp;i++) {
			System.out.println("enter the name of employe"+(i+1));
			String name=scan.nextLine();
			System.out.println("enter the year of joining");
			int year=scan.nextInt();
			System.out.println("enter the salary of employe"+(i+1));
			int salary=scan.nextInt();
			scan.nextLine();
			System.out.println("enter the address of the employe"+(i+1));
			String address=scan.nextLine();
			
			e[i].input(year, name, salary,address);
		}
		System.out.println("year of joining"+"\t"+"employe name"+"\t"+"salary"+"\t"+"address");
		for (int i=0;i<numemp;i++) {
			e[i].display();
		}
	//System.out.println("year of joining"+"\t"+"employe name"+"\t"+"salary"+"\t"+"address");
//		employe e1=new employe();
//		e1.input(25000, "ncharlieull", 1540, "nusbdfbsjbjbsjll");
//		e1.display();
	}
	void display(){
		System.out.println(name+"\t"+year_of_joining+"\t"+salary+"\t"+address);
		
	}
	void input(int yoj,String n,int s,String a) {
		year_of_joining=yoj;
		salary=s;
		name=n;
		address=a;
	}
	static int numobj() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of emolyees");
		int inputno=scan.nextInt();
		return inputno;
		
	}
}
//


