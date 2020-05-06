import java.util.Scanner;

/**
 * Programa para conocer los multiplos de un dado
 * @author Roberto Adrian Bonilla Ruiz
 * @version 7 Octubre
 */
public class Multiplos {
    public static void main(String[] pps) {
	Dado dadito = new Dado(); 	// Declarar las variables incluyendo un dado
	int producto1 = dadito.lanzar();
	int producto2 = dadito.lanzar();
	int dadoj1, resultadoD,resultadoP;
	int dadoj2; 
	String jugador1, enter;

	// Pedir al usuario su nombre 
	System.out.println("Bienvenido, ingresa tu nombre");
	Scanner lector = new Scanner(System.in);
	jugador1= lector.nextLine();

	// Pedir al usuario que tire su dado (solo debe dar ENTER)
	System.out.println(jugador1+" tira tu primer dado (Da un enter).");
	enter = lector.nextLine();
	dadoj1 = dadito.lanzar();
	

	System.out.println("Tira tu segundo dado (Da un enter).");
	enter = lector.nextLine();
	dadoj2 = dadito.lanzar();
	resultadoD = dadoj1*dadoj2;
	resultadoP = producto1*producto2;


	// Pedir al usuario que tire otra vez su dado (solo debe dar ENTER)
	System.out.println(jugador1 + " tu producto es "+resultadoD+" y mi producto es "+resultadoP);


	//Determinar si el producto del jugador es multiplo de 3, de 5 pero no de ambos
	if(resultadoD%2 == 0 || resultadoD%5 == 0){
		if(resultadoP%2 == 0 || resultadoP%5 == 0){
			System.out.println("Empate");
		}else{
			System.out.println(jugador1 +" Ganaste !!! :).");
		}
	}else{ 
		if(resultadoP%2 == 0 || resultadoP%5 == 0){
			System.out.println("Gana la computadora");
		}else{
			System.out.println("Todos pierden :(."); 
		}

	} 

	}
}
