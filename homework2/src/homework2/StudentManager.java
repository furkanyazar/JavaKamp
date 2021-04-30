package homework2;

public class StudentManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giriþ yaptý: öðrenci");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " çýkýþ yaptý: öðrenci");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " kayýt oldu: öðrenci");
	}
	
}
