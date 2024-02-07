package design_patterns.creationale.builder;

public class Main {

    public static void main(String[] args) {

        Cafea cafea1 = new Cafea.CafeaBuilder().setTipCafea(TipCafea.AMERICANO).build();

        Cafea cafea2 = new Cafea.CafeaBuilder().setTipCafea(TipCafea.LATTE).setCuLapte(true).setCuZahar(false).setDimensiune("M").build();

        System.out.println(cafea1.toString());
        System.out.println(cafea2.toString());


        CafeaV2 cafea3 = new CafeaV2(TipCafea.LATTE).setCuLapte(true).setCuZahar(false).setDimensiune("L");

        System.out.println(cafea3.toString());

    }


}
