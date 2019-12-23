package iacc.taller.aplicacionWeb.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iacc.taller.aplicacionWeb.entity.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {

	public Set<Libro> findByISBN(Long ISBN);

	public Set<Libro> findBynombreLibro(String nombreLibro);
}
