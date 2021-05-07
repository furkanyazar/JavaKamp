package homework4.dataAccess.concretes;

import homework4.dataAccess.abstracts.UserDao;
import homework4.entity.entities.User;

public class InMemoryUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName());
	}

	@Override
	public void confirm(User user) {
		System.out.println("Kullanýcý onaylandý: " + user.getFirstName());
		user.setConfirm(true);
	}

}
