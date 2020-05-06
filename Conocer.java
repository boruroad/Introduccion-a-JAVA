/**
  * Clase que permite conocer el valor de algunas variables
  * @author Bonilla Ruiz Roberto Adrián
  * @version 1.0
  */
public class Conocer {
    public static void  main(String[] pps){
    int resultado1;
    double resultado2;

/**
 * Programa que muestre el resultado desués de cada operación
 */
    resultado1 = 46/9;
    System.out.println(resultado1);

    resultado1 = 46 % 9 + 4 * 4 - 2;
    System.out.println(resultado1);

    resultado1 = 45 + 43 % 5 * (23 * 3 % 2);
    System.out.println(resultado1);

    resultado2 = 4 + resultado1 * resultado1+ 4;
    System.out.println(resultado2); 

    resultado2 += 1.5 * 3 + (++ resultado1);
    System.out.println(resultado2);

    resultado2 -=  1.5 * 3 + resultado1++;
    System.out.println(resultado2);


    System.out.println("\t***Conocer el valor de resultado1 y resultado2***\n");
    
	}
}

