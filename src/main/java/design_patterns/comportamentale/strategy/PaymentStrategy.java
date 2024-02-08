package design_patterns.comportamentale.strategy;

public interface PaymentStrategy {
    void pay(int value) throws Exception;
}
