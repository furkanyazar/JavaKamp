package homework2;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giriþ yaptý: genel");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " çýkýþ yaptý: genel");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " kayýt oldu: genel");
	}

}
