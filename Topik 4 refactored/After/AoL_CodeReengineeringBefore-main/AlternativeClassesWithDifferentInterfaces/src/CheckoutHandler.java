/*

Penyelesaian soal ini dilakukan dengan menggunakan sesuatu sejenis Replace Inheritance with Delegation.

pada konteks ini, penyelesaian yang paling biasa adalah inherintance (interface atau abstract class). Namun
melihat bahwa jika digunakan interface dan abstract class akan membutuhkan polymorphism (yang justru membuat code semakin
sulit untuk dibaca), diputuskan bahwa hal tersebut bukan hal yang tepat. Sehingga hal yang tepat adalah dengan menggunakan
perwakilan CurrencyConverter untuk menggantikan isi dari method convertToCurrency.

*/
import java.util.ArrayList;

public class CheckoutHandler {
	private ArrayList<Item> shoppingCart;


    public CheckoutHandler() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        shoppingCart.add(item);
    }

    public void removeItemFromCart(Item item) {
        shoppingCart.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : shoppingCart) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double convertToCurrency(double price, String currencyTo) {
        CurrencyConverter converter = new CurrencyConverter(currencyTo);
        return converter.convert(price);
    }

    public ArrayList<Item> getCart() {
        return shoppingCart;
    }

}
