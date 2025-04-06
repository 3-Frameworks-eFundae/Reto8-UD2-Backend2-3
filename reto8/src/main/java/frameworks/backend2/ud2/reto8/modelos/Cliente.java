package frameworks.backend2.ud2.reto8.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "clientes")
public class Cliente {

	@Id
	@Field(name = "_id")
	private String id;
	@Field(name = "id_cliente")
	private Long idCliente;
	private String nombre;
	@Field(name = "direccion")
	private String direccion;
	@Field(name = "numero_telefono")
	private int numeroTelefono;

	public Cliente() {
		super();
	}
	
	public Cliente(String id, Long idCliente, String nombre, String direccion, int numeroTelefono) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
}
