package frameworks.backend2.ud2.reto8.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frameworks.backend2.ud2.reto8.modelos.Animal;
import frameworks.backend2.ud2.reto8.repositorios.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository repositorio;
	
	public List<Animal> mostrarAnimales(){
		return repositorio.findAll();
	}
	
	public List<Animal> mostrarAnimalPorClienteId(Long id){
		return repositorio.findByDueñoId(id);
	}
}
