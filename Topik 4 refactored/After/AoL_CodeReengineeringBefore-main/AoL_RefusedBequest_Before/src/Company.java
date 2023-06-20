/*
	Karena kita tidak benar benar akan menggunakan warisan dari parent class kita, ini jadi code smell. Hal ini kita
	selesaikan dengan Replace Inheritance with Delegation, dimana disini jadinya menggunakan perwakilan saja, dibanding
	melakukan inherintance. Dengan demikian, kita bisa menggunakan method yang kita butuhkan saja.
*/

public class Company{
	private double revenues;
	private double expenses;
	private PersonalTaxCalculator taxCalc = new PersonalTaxCalculator();
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double taxCalc(double income, double expenses) {
		return taxCalc(income, expenses);
	}
	
	
}
