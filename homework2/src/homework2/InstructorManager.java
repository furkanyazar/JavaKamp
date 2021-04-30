package homework2;

public class InstructorManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giriþ yaptý: eðitmen");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " çýkýþ yaptý: eðitmen");
	}

}
