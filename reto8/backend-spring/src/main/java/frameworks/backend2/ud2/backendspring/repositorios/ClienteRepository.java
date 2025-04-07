package frameworks.backend2.ud2.backendspring.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import frameworks.backend2.ud2.backendspring.modelos.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
	
	@Query("{ 'id_cliente' : ?0 }")
	List<Cliente> findByClienteId(Long id);
}
