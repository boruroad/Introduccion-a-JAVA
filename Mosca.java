/**
 * Programa para trabajar con metodos de la clase String
 * @author  Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */
public class Mosca {
  public static void main (String [] pps) {
    String frase = new String ("Una mosca parada en la pared, en la pared              ");
    String frase1, frase2, frase3, frase4, frase5, frase6;
  
    System.out.println("\nCadena original: \"" + frase + "\"");

    //Contar caracteres de la cadena
    System.out.println("Longitud de la cadena: "+frase.length());  

    // Eliminar los blancos al final de la frase
    frase1 = frase.trim();  
    System.out.print("La cadena \"" + frase1 + "\"");

    //Contar caracteres de la nueva cadena
    System.out.println(" tiene " + frase1.length() + " caracteres "); 

    //Poner la frase1 en mayusculas
    frase2 =frase1.toUpperCase();

    // Sustituir las vocales por I's en frase2
    frase3 =frase2.replace('A' ,'I').replace('E' ,'I').replace('O' ,'I').replace('U' ,'I');

    // Sustituir las I'es por U's en frase3
    frase4 = frase3.replace('I','U');


    // Sustituir mosca por MOSCOTA en frase1
    frase5 =frase1.replace("mosca","MOSCOTA");

    // Agregar la frase1 PINTADA DE ROJO
    frase6 = frase1.concat(" PINTADA DE ROJO");

    
    // Imprimir cada "mutacion" de la cadena
    System.out.println("\nFrase #1: " + frase1);

    System.out.println("\nFrase #2: " + frase2);

    System.out.println("\nFrase #3: " + frase3);

    System.out.println("\nFrase #4: " + frase4);

    System.out.println("\nFrase #5: " + frase5);
    
    System.out.println("\nFrase #6: " + frase6);
    
  }
}
