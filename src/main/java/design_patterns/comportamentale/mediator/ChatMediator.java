package design_patterns.comportamentale.mediator;

public interface ChatMediator {
    void SendMessage(String message, User user);
    void addUser(User user);
}
