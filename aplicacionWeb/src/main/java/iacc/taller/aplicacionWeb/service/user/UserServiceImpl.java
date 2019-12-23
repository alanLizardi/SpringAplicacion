package iacc.taller.aplicacionWeb.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iacc.taller.aplicacionWeb.entity.User;
import iacc.taller.aplicacionWeb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userR;

	@Override
	public Iterable<User> getAllUsers() {

		return userR.findAll();
	}

}
