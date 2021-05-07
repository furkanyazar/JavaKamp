package homework4.business.concretes;

import java.util.ArrayList;
import java.util.List;

import homework4.Utils;
import homework4.business.abstracts.SendConfCodeToUserService;
import homework4.business.abstracts.UserCheckService;
import homework4.business.abstracts.UserService;
import homework4.dataAccess.abstracts.UserDao;
import homework4.entity.entities.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserCheckService userCheckService;
	private SendConfCodeToUserService sendConfCodeToUserService;
	public static List<User> users;

	public UserManager(UserDao userDao, UserCheckService userCheckService , SendConfCodeToUserService sendConfCodeToUserService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.sendConfCodeToUserService = sendConfCodeToUserService;
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		if (Utils.validate(user.getEmail()) && user.getFirstName().length() > 1 && user.getLastName().length() > 1
				&& user.getPassword().length() > 5 && !userCheckService.isThereEmail(user)) {
			userDao.add(user);
			sendConfCodeToUserService.sendCode(user);
			users.add(user);
		} else {
			System.out.println("Bilgiler hatalý: " + user.getFirstName());
		}
	}

}
