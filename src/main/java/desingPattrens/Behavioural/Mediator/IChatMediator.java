package main.java.desingPattrens.Behavioural.Mediator;

public interface IChatMediator {

	public void sendMessage(String message, User user);
	public void addUser(User user);
	
}
