
public class Company {
	private double revenues;
	private double expenses;
	private PersonalTaxCalculator ptc;
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	
	// pakai yang perlu aja
	public double calculateTax(double taxRate) {
		return ptc.calculateTax(getIncome(), taxRate);
	}
}
