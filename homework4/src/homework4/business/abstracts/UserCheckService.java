package homework4.business.abstracts;

import homework4.entity.entities.User;

public interface UserCheckService {
	
	boolean isThereEmail(User user);
	boolean logIn(User user);

}
