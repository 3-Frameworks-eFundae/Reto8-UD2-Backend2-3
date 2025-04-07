package frameworks.backend2.ud2.backendspring.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import frameworks.backend2.ud2.backendspring.modelos.Animal;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, String> {
	@Query("{ 'dueno.id_cliente' : ?0 }")
	List<Animal> findByDueñoId(Long id);
}
