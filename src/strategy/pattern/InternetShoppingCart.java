package strategy.pattern;

import java.util.ArrayList;
import java.util.List;

public class InternetShoppingCart {
    private List<Item> items;

    public InternetShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double calculateTotal() {
        double sum = 0;

        for (Item item : this.items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();

        paymentMethod.pay(amount);
    }
}
