package homework4.business.concretes;

import homework4.business.abstracts.LogInService;
import homework4.business.abstracts.UserCheckService;
import homework4.entity.entities.User;

public class LogInManager implements LogInService {

	@Override
	public void LogIn(User user, UserCheckService userCheckService) {
		if (userCheckService.logIn(user))
			System.out.println("Giriþ baþarýlý: " + user.getFirstName());
		else
			System.out.println("Giriþ baþarýsýz: " + user.getFirstName());
	}
	
}
