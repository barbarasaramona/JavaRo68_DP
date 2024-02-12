package design_patterns.comportamentale.state;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setState(new TvStartState());
        tv.doAction();
        tv.setState(new TvStopState());
        tv.doAction();
        tv.setState(new TvSleepState());
        tv.doAction();
    }

}
