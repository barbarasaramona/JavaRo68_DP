package design_patterns.comportamentale.strategy;

public class Main {

    public static void main(String[] args) {

        Item lapte = new Item("001", 15);
        Item cascaval = new Item ("002", 25);
        Item branza = new Item ("003", 12);

        ShoppingCart cos = new ShoppingCart();

        cos.addItem(lapte);
        cos.addItem(cascaval);
        cos.addItem(branza);

        cos.removeItem(branza);

        cos.pay(new PayPalStrategy("tibi@yahoo.com", "1234"));
//      cos.pay(new CreditCardStrategy("Tibi", "00001111","333","15/02/2025"));
        cos.pay(new CreditCardStrategy(null, "00001111","333","15/02/2025"));

    }


}
