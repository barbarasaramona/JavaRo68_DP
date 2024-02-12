package design_patterns.comportamentale.state;

public class TvStartState implements State{
    @Override
    public void doAction() {
        System.out.println("pornit");
    }
}
