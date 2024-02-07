package design_patterns.structurale.adapter;

public class Main {
    public static void main(String[] args) {
        Fazan fazan = new Fazan();
        Porumbel porumbel = new Porumbel();
        Cocos cocos = new Cocos();

        System.out.print("Fazan: ");
        fazan.fly();
        fazan.makeSound();

        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        plasticToyDuck.squeak();

        PlasticToyAction fazanPlasticToy = new BirdAdapter(fazan);
        fazanPlasticToy.squeak();

        PlasticToyAction porumbelPlasticToy = new BirdAdapter(porumbel);
        porumbelPlasticToy.squeak();

        PlasticToyAction cocosPlasticToy = new BirdAdapter(cocos);
        cocosPlasticToy.squeak();
    }
}
