package Mediator;

public class MainMediator {

	public static void main(String[] args) {
		
		IChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "batux");
		User user2 = new UserImpl(mediator, "vatux");
		User user3 = new UserImpl(mediator, "tatux");
		User user4 = new UserImpl(mediator, "patux");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hello world !");
	}

}
