class Carr {
	public void start_engine(){
		System.out.println("\nEngine started!");
	}
}
public class start_engine_method extends Carr{
	public void start_engine() {
		System.out.println("\nElectric motor started!");
	}
	public static void main(String args[]) {
		start_engine_method ec = new start_engine_method();
		ec.start_engine();
	}
}

