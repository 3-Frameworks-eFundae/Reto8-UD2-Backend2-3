package frameworks.backend2.ud2.backendspring.modelos;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "animales")
public class Animal {

	@Id
	@Field(name = "_id")
	private String id;
	@Field(name = "id_animal")
	private Long idAnimal;
	private String nombre;
	private String especie;
	private String raza;
	@Field(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@Field(name = "dueno")
	private Cliente dueno;
	
	public Animal(Long idAnimal, String nombre, String especie, String raza, Date fechaNacimiento, Cliente dueno) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
		this.dueno = dueno;
	}
	public Animal() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Cliente getDueno() {
		return dueno;
	}
	public void setDueno(Cliente dueno) {
		this.dueno = dueno;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", idAnimal=" + idAnimal + ", nombre=" + nombre + ", especie=" + especie + ", raza="
				+ raza + ", fechaNacimiento=" + fechaNacimiento + ", dueno=" + dueno + "]";
	}
}
