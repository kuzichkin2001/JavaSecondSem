package strategy.pattern;

public final class CreditCardStrategy implements PaymentStrategy {
    private final String fullName;
    private final String cardNumber;
    private final String cvvCode;
    private final String expirationDate;

    public CreditCardStrategy(String fn, String cNum, String cvv, String expDate) {
        this.fullName = fn;
        this.cardNumber = cNum;
        this.cvvCode = cvv;
        this.expirationDate = expDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " оплачено банковской картой.");
    }
}
