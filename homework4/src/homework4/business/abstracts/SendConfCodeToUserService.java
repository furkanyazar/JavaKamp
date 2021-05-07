package homework4.business.abstracts;

import homework4.entity.entities.User;

public interface SendConfCodeToUserService {
	
	void sendCode(User user);

}
