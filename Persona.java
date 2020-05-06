/**
 * Clase que representa una persona.
 * @author Marco Olea
 * @version 1.0
 */
public class Libro{
	private String
		

	private String nombre;

	/**
	 * Crea una nueva persona con el nombre dado.
	 * @param nombre el nombre de la persona
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Regresa el nombre de esta persona.
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nuevo nombre a esta persona.
	 * @param nombre el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}