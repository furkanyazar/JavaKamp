package homework4.business.concretes;

import homework4.business.abstracts.ConfirmToUserService;
import homework4.dataAccess.abstracts.UserDao;
import homework4.entity.entities.User;

public class ConfirmToUserManager implements ConfirmToUserService {
	
	private UserDao userDao;
	
	public ConfirmToUserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void confirmToUser(User user, String confirmCode) {
		if (user.getConfirmCode() == confirmCode) {
			for (User u : UserManager.users) {
				if (u.getConfirmCode() == user.getConfirmCode()) {
					userDao.confirm(user);
					break;
				}
			}
		} else {
			System.out.println("Doðrulama kodu hatalý");
		}
	}

}
