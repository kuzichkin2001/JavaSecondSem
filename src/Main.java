import adapter.pattern.LamborghiniUrus;
import adapter.pattern.Movable;
import adapter.pattern.MovableAdapter;
import adapter.pattern.MovableAdapterImpl;
import strategy.pattern.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter pattern test: ");
        Movable urus = new LamborghiniUrus();
        MovableAdapter urusAdapter = new MovableAdapterImpl(urus);

        System.out.println(urus.getSpeed() * 1.60934 + " km/h");
        System.out.println(urusAdapter.getSpeed() + " km/h");

        System.out.println("\n-----------------------------------\n");

        System.out.println("Strategy pattern test: ");
        RealLifeShoppingCart shoppingCart = new RealLifeShoppingCart();

        Item item1 = new Item("1234", 123.0);
        Item item2 = new Item("2345", 456.0);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new CreditCardStrategy(
                "Kuzichkin Pavel",
                "1234567890123456",
                "123",
                "12.12.2022"
        ));

        shoppingCart.pay(new PaypalStrategy("kuzichkinpa@gmail.com", "12345678"));

        System.out.println();

        InternetShoppingCart internetShoppingCart = new InternetShoppingCart();

        Item item3 = new Item("9099", 599.0);
        Item item4 = new Item("10101", 1990.0);

        internetShoppingCart.addItem(item3);
        internetShoppingCart.addItem(item4);

        internetShoppingCart.pay(new CreditCardStrategy(
                "Kuzichkin Pavel",
                "1234567890123456",
                "123",
                "12.12.2022"
        ));

        internetShoppingCart.pay(new PaypalStrategy("kuzichkinpa@gmail.com", "12345678"));
    }
}