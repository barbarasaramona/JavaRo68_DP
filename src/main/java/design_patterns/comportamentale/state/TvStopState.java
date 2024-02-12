package design_patterns.comportamentale.state;

public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("oprit");
    }
}
