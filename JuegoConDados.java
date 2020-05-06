/**
 *  Esta clase se contiene un programa para jugar dadoa con  la computadora
 *  @author Roberto Adrian Bonilla Ruiz
 */
import java.util.Scanner;
public class JuegoConDados {
    
    public static void main(String args[]) {
        
        /*
         *  Aqui, crea los objetos necesarios y usa los metodos
         *  adecuados para resolver tu problema.
         */
        Scanner lector = new Scanner(System.in);
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int resultado1, resultado2, resultado3, resultado4, total;
        String jugador1, enter;

        System.out.println("Bienvenido, vamos a jugar con los dados");
        System.out.println("Dame tu nombre");
        jugador1 = lector.nextLine();

        System.out.println(jugador1+" tira los dados. (Da un enter)");
        enter = lector.nextLine();
        enter = enter.trim();

        resultado1 = dado1.lanzar();
        resultado2 = dado2.lanzar();

        total = resultado1 + resultado2;

        System.out.println("El primer dado tuvo "+ resultado1+" y el segundo dado tuvo "+resultado2);

        System.out.print(jugador1+ " la suma es "+ total);
            if(total == 7 || total == 11){
                System.out.println("\n" + jugador1 + " Ganaste !!! :).");
            }if(total == 2 || total == 3 || total == 12){
                System.out.println("\nPerdiste !!! :(.");
            }if(total == 4 || total == 5 || total == 6 || total == 8 || total == 9 || total == 10){
                System.out.println(" vuelve a tirar los dados (Da un enter)");
                enter = lector.nextLine();

                resultado3 = dado1.lanzar();
                resultado4 = dado2.lanzar();
                total = resultado3 + resultado4;

                System.out.println(jugador1+" la nueva suma es "+total);
                if(total == 7 || total == 11){
                    System.out.println(jugador1 + " Ganaste !!! :).");
                        }else{
                            System.out.println("Perdiste !!! :(.");
                        }             

        }

        
    }   

    
}   