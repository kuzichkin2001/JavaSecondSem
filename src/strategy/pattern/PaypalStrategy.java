package strategy.pattern;

public final class PaypalStrategy implements PaymentStrategy {
    private final String emailId;
    private final String password;

    public PaypalStrategy(String email, String pass) {
        this.emailId = email;
        this.password = pass;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " оплачено при помощи Paypal");
    }
}
