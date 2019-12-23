package iacc.taller.aplicacionWeb.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iacc.taller.aplicacionWeb.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public Set<User> findByUsername(String username);
}
