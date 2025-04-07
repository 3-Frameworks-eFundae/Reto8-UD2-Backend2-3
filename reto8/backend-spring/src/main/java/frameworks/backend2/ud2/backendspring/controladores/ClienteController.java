package frameworks.backend2.ud2.backendspring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import frameworks.backend2.ud2.backendspring.modelos.Cliente;
import frameworks.backend2.ud2.backendspring.servicios.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private ClienteService servicio;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> mostrarClientes(){
		return servicio.mostrarClientes();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> mostrarClientePorId(@PathVariable Long id){
		return servicio.mostrarClientePorId(id);
	}
}