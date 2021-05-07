package homework4.core.concretes;

import homework4.core.abstracts.LogInService;
import homework4.googleLogIn.GoogleLogInManager;

public class GoogleLogInManagerAdapter implements LogInService {

	@Override
	public boolean logIn(String email) {
		GoogleLogInManager googleLogInManager = new GoogleLogInManager();
		return googleLogInManager.logIn(email);
	}

}
