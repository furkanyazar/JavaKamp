package homework2;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giri� yapt�: genel");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " ��k�� yapt�: genel");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " kay�t oldu: genel");
	}

}
