/**
 * Clase que representa una persona.
 * @author Roberto Adrián Bonilla Ruiz
 * @version 1.0 11/Sep/19
 */

/**
*Declaracion de la clase
**/
public class Libro{
	private String titulo; 
	private String autor;
	private int ano;	
/**
*Constructor default
**/
	public Libro (){
	 	titulo = "";
	 	autor = "";
	 	ano = 0;
	}

	/**
	 * Constructor con parametros.
	 * @param  t  Encabezado del libro
	 * @param  a  Quien fue escrito el libro
	 * @param  an Fecha en la que se publico   
	 */

	public Libro(String t, String a, int an ) {
				titulo = t;
	 			autor = a;
	 			ano = an;

			}

	/**
	 * Método para cambiar el título
	 * @param t Nuevo Título 
	 */		
	public void cambiarTitulo(String t){
		titulo = t;
	}

	/**
	 * Método para cambiar el autor
	 * @param a Nuevo Autor 
	 */	
	public void cambiarAutor(String a){
		autor = a;
	}

	/**
	 * Método para cambiar el Año
	 * @param an Nuevo Año 
	 */	
	public void cambiarAno(int an){
		ano = an;
	}

	/**
	 * Método para obtener el Título
	 * @return título
	 */	
	public String obtenerTitulo(){
		return titulo;
	}



	/**
	 * Método para obtener el Autor
	 * @return autor
	 */	
	public String obtenerAutor(){
		return autor;
	}

	

		/**
	 * Método para obtener el Año
	 * @return Año
	 */	
	public int obtenerAno(){
	return ano;	
	}
	 

}