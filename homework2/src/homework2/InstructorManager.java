package homework2;

public class InstructorManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giri� yapt�: e�itmen");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " ��k�� yapt�: e�itmen");
	}

}
