package design_patterns.comportamentale.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> products;
    private boolean isPaid;

    public ShoppingCart() {
         this.products = new ArrayList<>();
         isPaid = false;
    }

    void addItem(Item item)
    {
        products.add(item);
        System.out.println("S-a adaugat produsul cu codul " + item.getUpcCode());
        System.out.println(products);

    }
    void removeItem(Item item)
    {
        products.remove(item);
        System.out.println("S-a scos produsul cu codul " + item.getUpcCode());
        System.out.println(products);
    }
    int calcultateTotal()
    {
        int sum = 0;
        for(Item product:products)
        {
            sum += product.getPrice();
        }
        return sum;
    }
    void pay(PaymentStrategy paymentStrategy)
    {
        if(isPaid == true)
        {
            System.out.println("Cosul este deja platit");

        }
        else {
            try {
                paymentStrategy.pay(calcultateTotal());
                isPaid = true;
            } catch (Exception e) {
                System.out.println("Nu s-a putut face plata");
            }
        }
    }
}
