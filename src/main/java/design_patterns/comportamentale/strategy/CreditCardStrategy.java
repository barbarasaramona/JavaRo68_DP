package design_patterns.comportamentale.strategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int value) throws Exception {
        if(name != null) {
            System.out.println("Suma de " + value + " a fost platita cu Cardul de credit");
        }
        else {
            throw new Exception();
        }
    }
}
