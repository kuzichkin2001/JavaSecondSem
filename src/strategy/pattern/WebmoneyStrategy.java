package strategy.pattern;

import java.rmi.server.UID;

public class WebmoneyStrategy implements PaymentStrategy {
    private String username;
    private UID walletId;
    private String walletName;

    public WebmoneyStrategy(String username, UID walletId, String walletName) {
        this.username = username;
        this.walletId = walletId;
        this.walletName = walletName;
    }

    public void pay(double amount) {
        System.out.println(amount + " оплачено при помощи Webmoney");
    }
}
