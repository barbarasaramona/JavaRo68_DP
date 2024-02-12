package design_patterns.mediator;

public abstract class User {

    protected String name;
    protected String userName;
    ChatMediator chatMediator;

    public User(ChatMediator chatMediator, String userName, String name) {
        this.chatMediator = chatMediator;
        this.userName = userName;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);


}
