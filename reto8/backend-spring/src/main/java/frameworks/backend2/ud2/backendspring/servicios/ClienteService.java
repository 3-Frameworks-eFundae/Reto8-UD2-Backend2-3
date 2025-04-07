package frameworks.backend2.ud2.backendspring.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frameworks.backend2.ud2.backendspring.modelos.Cliente;
import frameworks.backend2.ud2.backendspring.repositorios.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repositorio;
	
	public List<Cliente> mostrarClientes(){
		return repositorio.findAll();
	}

	public List<Cliente> mostrarClientePorId(Long id){
		return repositorio.findByClienteId(id);
	}
}
