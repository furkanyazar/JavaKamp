package homework4.dataAccess.abstracts;

import homework4.entity.entities.User;

public interface UserDao {
	
	void add(User user);
	void confirm(User user);

}
