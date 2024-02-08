package design_patterns.comportamentale.strategy;

import java.util.SortedMap;

public class PaypalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int value) {
        System.out.println("Suma de" + value + " a fost platita prin paypal");
    }
}
