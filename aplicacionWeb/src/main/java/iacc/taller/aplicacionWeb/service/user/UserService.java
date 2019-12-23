package iacc.taller.aplicacionWeb.service.user;

import iacc.taller.aplicacionWeb.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();
	
	public User createUser(User User) throws Exception;
}
