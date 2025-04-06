package frameworks.backend2.ud2.reto8.controladores;


import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public HashMap<String, String> mostrarClientes(){
		HashMap<String, String> mensaje = new HashMap<String, String>();
		mensaje.put("Mensaje", "Hola mundo");
		return mensaje;
	}
}
