package homework4.business.concretes;

import homework4.business.abstracts.SendConfCodeToUserService;
import homework4.entity.entities.User;

public class SendConfCodeToUserManager implements SendConfCodeToUserService {

	@Override
	public void sendCode(User user) {
		System.out.println("Kod gönderildi: " + user.getFirstName());
	}
	
}
