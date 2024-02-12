package design_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    List<User> users;
    public ChatMediatorImpl() {
        users = new ArrayList<User>();
    }

    @Override
    public void SendMessage(String message, User user) {
        for (User element: users) {
            if(!element.equals(user))
                {
                    element.receive(message);
                }
        }
    }

    @Override
    public void addUser(User user) {
        if(users.contains(user))
        {
            System.out.println("User-ul exista deja");
        }
        else {
            users.add(user);
        }

    }
}
