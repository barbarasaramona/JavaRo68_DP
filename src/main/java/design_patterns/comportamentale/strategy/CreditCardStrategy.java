package design_patterns.comportamentale.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExp;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExp) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExp = dateOfExp;
    }

    @Override
    public void pay(int suma) throws Exception {
        if(name != null) {
            System.out.println("Suma " + suma + " a fost platita cu credit cardul ");
        } else {
            throw new Exception();
        }
    }
}
