package homework4.business.concretes;

import homework4.business.abstracts.UserCheckService;
import homework4.entity.entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isThereEmail(User user) {
		boolean isThereEmail = false;
		
		for (User u : UserManager.users) {
			if (u.getEmail() == user.getEmail()) {
				isThereEmail = true;
				break;
			}
		}
		
		return isThereEmail;
	}

	@Override
	public boolean logIn(User user) {
		boolean logIn = false;
		
		for (User u : UserManager.users) {
			if (user.isConfirm() && user.getEmail() == u.getEmail() && user.getPassword() == u.getPassword()) {
				logIn = true;
				break;
			}
		}
		
		return logIn;
	}

}
