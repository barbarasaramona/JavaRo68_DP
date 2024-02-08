package design_patterns.comportamentale.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

//    List<Item> produse = new ArrayList<>();      Folosim in constructor initializarea.

    List<Item> produse;

    public ShoppingCart() {
        this.produse = new ArrayList<>();
    }

    public void addItem(Item item) {

        produse.add(item);
        System.out.println("Produsul " + item.getUpcCode() + " a fost adaugat.");
        System.out.println(produse);

    }

    public void removeItem(Item item) {

        produse.remove(item);
        System.out.println("Produsul " + item.getUpcCode() + " a fost sters.");
        System.out.println(produse);
    }

    public int calculateTotal() {

        int suma = 0;
        for (Item element : produse) {
            suma += element.getPrice();
        }
        return suma;
    }

    public void pay(PaymentStrategy payment){
        try {
            payment.pay(calculateTotal());
        }catch (Exception e){

            System.out.println("Plata nu s-a putut realiza");
        }
    }




}
