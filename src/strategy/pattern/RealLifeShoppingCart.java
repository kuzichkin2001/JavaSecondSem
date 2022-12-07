package strategy.pattern;

import java.util.ArrayList;
import java.util.List;

public class RealLifeShoppingCart {
    private List<Item> items;

    public RealLifeShoppingCart() {
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

        if (paymentMethod instanceof CreditCardStrategy) {
            paymentMethod.pay(amount);
        }
        else {
            System.out.println("Вы не можете оплачивать покупки при помощи WebMoney или PayPal");
        }
    }
}
