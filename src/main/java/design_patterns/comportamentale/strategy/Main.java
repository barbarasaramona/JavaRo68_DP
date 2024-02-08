package design_patterns.comportamentale.strategy;

public class Main {
    public static void main(String[] args) {
        Item lapte = new Item("001", 15);
        Item unt = new Item("002", 20);
        Item paine = new Item("003",7);
        Item cascaval = new Item("004", 15);

        ShoppingCart cosul1 = new ShoppingCart();
        cosul1.addItem(lapte);
        cosul1.addItem(unt);
        cosul1.addItem(paine);
        cosul1.addItem(cascaval);
        cosul1.removeItem(unt);
        cosul1.removeItem(paine);

        PaymentStrategy paypal = new PaypalStrategy("email@domain.com","Password");
        PaymentStrategy card = new CreditCardStrategy("Teodor Caraba","0123456789098765","012","12.02.2024");

        cosul1.pay(card);
        cosul1.pay(paypal);

    }
}
