package design_patterns.structurale.adapter;

public class BirdAdapter implements PlasticToyAction{
    public BirdAction birdAction;

    public BirdAdapter(BirdAction birdAction) {
        this.birdAction = birdAction;
    }

    @Override
    public void squeak() {
        birdAction.makeSound();
    }
}
