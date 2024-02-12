package design_patterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator slack = new ChatMediatorImpl();
        User user1 = new UserImpl(slack,"user1", "User1");
        User user2 = new UserImpl(slack,"user2", "User2");
        User user3 = new UserImpl(slack,"user3", "User3");
        slack.addUser(user1);
        slack.addUser(user2);
        slack.addUser(user3);

        user2.send("I'm going home");

        user3.send("Byee");

    }

}
