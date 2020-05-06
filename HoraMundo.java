/**
 *  Clase HoraMundo.
 *  Esta clase se encarga de desplegar en pantalla
 *  la hora de 3 ciudades diferentes.
 *  @author Bonilla Ruiz Roberto Adrian
 */
public class HoraMundo {
    
    public static void main(String args[]) {  
        /*
         *  Aqui, crea los objetos necesarios y usa los metodos
         *  adecuados para resolver tu problema.
         */

        Reloj tokyo =  new Reloj();
        Reloj mexico =  new Reloj();
        Reloj ny =  new Reloj(); 

        String mex = mexico.horaMexicoDF()+" en \"Mexico D.F.\"";
        String tok = tokyo.horaTokio() + " en \"Tokyo, Japon\"";
        String n = ny.horaNuevaYork() +" en \"Nueva York, U.S.A\"";


        System.out.println(mex + " \n"+tok+ " \n"+ n );



        
    }
    
}