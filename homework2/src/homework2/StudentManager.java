package homework2;

public class StudentManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giri� yapt�: ��renci");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " ��k�� yapt�: ��renci");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " kay�t oldu: ��renci");
	}
	
}
