package design_patterns.structurale.adapter;

public class Main {
    public static void main(String[] args) {
        Fazan fazan = new Fazan();
        System.out.print("Fazan: ");
        fazan.fly();
        fazan.makeSound();

        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        plasticToyDuck.squeak();

        PlasticToyAction fazanPlasticToy = new BirdAdapter(fazan);
        fazanPlasticToy.squeak();

        Porumbel porumbel = new Porumbel();
        PlasticToyAction porumbelPlasticToy = new BirdAdapter(porumbel);
        porumbelPlasticToy.squeak();

        Cocos cocos = new Cocos();
        PlasticToyAction cocosPlasticToy = new BirdAdapter(cocos);
        cocosPlasticToy.squeak();
    }
}
