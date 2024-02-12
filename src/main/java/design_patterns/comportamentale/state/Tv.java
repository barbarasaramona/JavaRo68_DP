package design_patterns.comportamentale.state;

public class Tv implements State{
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        System.out.print("Televizorul a fost :");
        this.state.doAction();

    }
}
