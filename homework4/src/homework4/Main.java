package homework4;

import homework4.business.abstracts.ConfirmToUserService;
import homework4.business.abstracts.LogInService;
import homework4.business.concretes.ConfirmToUserManager;
import homework4.business.concretes.LogInManager;
import homework4.business.concretes.SendConfCodeToUserManager;
import homework4.business.concretes.UserCheckManager;
import homework4.business.concretes.UserManager;
import homework4.dataAccess.concretes.InMemoryUserDao;
import homework4.entity.entities.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------- User 1 ----------");
		User user1 = new User(1, "Furkan", "Yazar", "deneme@mail.com", "123456", "randomCode");

		UserManager userManager = new UserManager(new InMemoryUserDao(), new UserCheckManager(),
				new SendConfCodeToUserManager());
		userManager.add(user1);

		ConfirmToUserService confirmToUserService = new ConfirmToUserManager(new InMemoryUserDao());
		confirmToUserService.confirmToUser(user1, "randomCode");

		LogInService logInService = new LogInManager();
		logInService.LogIn(user1, new UserCheckManager());

		System.out.println("---------- User 2 ----------");
		User user2 = new User(2, "Ali", "Veli", "deneme@mail.com", "123456", "randomCode2");

		userManager.add(user2);
		
		System.out.println("---------- User 3 ----------");
		User user3 = new User(3, "Hasan", "Hüseyin", "deneme1@mail.com", "123456", "randomCode3");

		userManager.add(user3);

		confirmToUserService.confirmToUser(user3, "randomCode2");
		
		logInService.LogIn(user3, new UserCheckManager());
	}

}
