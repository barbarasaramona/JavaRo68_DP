package design_patterns.comportamentale.strategy;

public class PayPalStrategy implements PaymentStrategy {


    private String email;
    private String parola;

    public PayPalStrategy(String email, String parola) {
        this.email = email;
        this.parola = parola;
    }

    @Override
    public void pay(int suma) {

        System.out.println("Suma " + suma + " a fost platita prin PayPal");

    }
}
