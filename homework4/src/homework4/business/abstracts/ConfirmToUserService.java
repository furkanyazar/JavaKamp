package homework4.business.abstracts;

import homework4.entity.entities.User;

public interface ConfirmToUserService {
	
	void confirmToUser(User user, String confirmCode);
	
}
