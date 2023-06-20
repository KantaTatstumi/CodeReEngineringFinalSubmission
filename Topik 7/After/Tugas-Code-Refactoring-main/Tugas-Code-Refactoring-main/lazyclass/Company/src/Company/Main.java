package Company;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		ArrayList<Integer> salary = new ArrayList<Integer>();
		nama.add("Jack");
		nama.add("Dull");
		salary.add(10000);
		salary.add(2000);

		// workers jack = new workers("jack anderson",10000);
		// workers keila = new workers("Keila rin", 11000);
		for(int i = 0; i < 2; i++){
			System.out.println(nama.get(i) + "'s salary is Rp." + salary.get(i));
		}
		
	}
}
