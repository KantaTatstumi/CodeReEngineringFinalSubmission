
public class CurrencyConverter {
	

    public double convert(double price, String currencyTo) {
        if (currencyTo.equalsIgnoreCase("EUR")) {
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("IDR")) {
            return price * 1;
        } else {
            throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
        }
    }
}
