package design_patterns.comportamentale.state;

public class TvSleepState implements State{
    @Override
    public void doAction() {
        System.out.println("sleep");
    }
}
