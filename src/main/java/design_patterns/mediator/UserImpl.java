package design_patterns.mediator;

public class UserImpl extends User{
    public UserImpl(ChatMediator chatMediator,String userName, String name) {
        super(chatMediator,userName, name);
    }
    @Override
    public void send(String message) {
        System.out.println(name + " a trimis mesajul: " + message);
        chatMediator.SendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " a primit mesajul: " + message);
    }
    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        //if(user.name == this.name && user.userName == this.userName)
        //{
        //    return true;
        //}
        //return false;
        return user.name == this.name && user.userName == this.userName;
    }

}
