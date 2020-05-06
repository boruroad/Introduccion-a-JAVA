/**
  * Clase para calcular el area y volumen de un cilindro
  * @author Roberto Adrian Bonilla Ruiz
  * @version 1.0
  */
public class Cilindro {
    public  static  void main(String[] pps){
	double pi = Math.PI;
	// A= 2*pi*radio*(radio + altura)

		//Define aqui las variables necesarias
	double radio = 25;
	double altura = 57.23;
	double volumen;
	double area;

	// Calcular el volumne y el area
	area =2*pi*radio*(altura+radio);
	volumen = area*altura;

		//Completar las siguientes lineas 
	System.out.println("\t***Area y volumen de un cilindro***\n");

	System.out.println("El area del cilindro es: "+area);
	System.out.println("El volumen del cilindro es: "+volumen);
    }
}

