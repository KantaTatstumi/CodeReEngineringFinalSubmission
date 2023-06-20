import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(item Item) {
        items.add(Item);
    }

    public void removeItem(item Item) {
        items.remove(Item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(item::getPrice).sum();
    }

    public void printItems() {
        
        items.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        item item1 = new item("Product 1", 10);
        item item2 = new item("Product 2", 20);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.printItems();
        System.out.println("Total : $" + cart.calculateTotal());
    }
}

