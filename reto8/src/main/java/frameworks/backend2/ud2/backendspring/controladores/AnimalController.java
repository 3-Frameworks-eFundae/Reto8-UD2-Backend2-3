package frameworks.backend2.ud2.reto8.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import frameworks.backend2.ud2.reto8.modelos.Animal;
import frameworks.backend2.ud2.reto8.servicios.AnimalService;

@RestController
@RequestMapping("/animales")
public class AnimalController {

	@Autowired
	private AnimalService servicio;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Animal> mostrarAnimales(){
		return servicio.mostrarAnimales();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Animal> mostrarAnimalPorClienteId(@PathVariable Long id){
		return servicio.mostrarAnimalPorClienteId(id);
	}
}
