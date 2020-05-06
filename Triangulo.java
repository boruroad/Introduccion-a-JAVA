package geometria;
import java.lang.Math;
/** Representa un polígono de tres lados. EStá definido por 
 * tres puntos en el plano cartesiano
 * @since 1.0
 */

public class Triangulo{

	private  Punto a;
	private  Punto b;
	private  Punto c;
	private double ab = a.distancia(b);
	private double bc = b.distancia(c);
	private double ca = c.distancia(a);

	/**
	 * Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
	 */
	public Triangulo(){
		Punto a = new Punto(0,0);
		Punto b = new Punto(1,0);
		Punto c = new Punto(0.5, (Math.sin(Math.PI / 3)));
		
	}
/**
 * @param Punto a "Punto del vértice"
 * @param Punto b "Punto del vértice"
 * @param Punto c "Punto del vértice"
 */
	public Triangulo(Punto a, Punto b, Punto c){
		this.a = new Punto (a.getX(),a.getY());
		this.b = new Punto (b.getX(),b.getY());
		this.c = new Punto (c.getX(),c.getY());
		 

	}   /**
		 * Determina si los vértices de este triángulo están alineados.
		 */
		public boolean tieneVerticesAlineados(){
			if (a.equals(b) && b.equals(c)){
			return true;
			}
			
		}

		//Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
		public int tipo(){
			if(ab == bc && ba == ca){
				System.out.println("Equilatero");
			}else{
				if (a.distancia(b) == b.distancia(c) && c.distancia(a) ||
			 a.distancia(b) == b.distancia(c) && c.distancia(a));
			}else{
				if 
			}


		}
		/**
		*Triangulo con todos sus lados de la misma longitud.
		*/

		public static final int EQUILATERO(){
			
			if(a.distancia(b) == b.distancia(c) == c.distancia(a));
			System.out.println("Es EQUILATERO");

		}

		public static final int ISOSCELES(){
			if (a.distancia(b) == b.distancia(c) && c.distancia(a) ||
			 a.distancia(b) == b.distancia(c) && c.distancia(a));
			System.out.println("Es isósceles");
		}

		public static final int ESCALENO(){
			if (a.distancia(b) != b.distancia(c) != c.distancia(a))
		}

}