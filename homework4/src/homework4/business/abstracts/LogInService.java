package homework4.business.abstracts;

import homework4.entity.entities.User;

public interface LogInService {
	
	void LogIn(User user, UserCheckService userCheckService);

}
