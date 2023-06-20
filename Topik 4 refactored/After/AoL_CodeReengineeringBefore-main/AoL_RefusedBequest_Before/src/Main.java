
public class Main {

	public static void main(String[] args) {
		Company abc = new Company(5000000000.0, 2500000000.0);
		double tax = abc.taxCalc(abc.taxCalc(0, 0.3), 0.3);
		
		System.out.println(tax);
	}

}
