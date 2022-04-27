package exceptionHandling;

public class LoginException extends Exception {
public LoginException() {
	super ("Invalid User ID/Password");
}

public <User> void authenticate (String login, String pwd) throws LoginException{
User u= UserDAO.get(login,pwd);
if (u==null) {
	throw new LoginException();
}
}}