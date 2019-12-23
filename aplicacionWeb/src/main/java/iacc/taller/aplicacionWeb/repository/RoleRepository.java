package iacc.taller.aplicacionWeb.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iacc.taller.aplicacionWeb.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
