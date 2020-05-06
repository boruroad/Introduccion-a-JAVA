import java.util.Scanner;

public class Acceso{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String clave = "yudu";
		String pass = "";
		String enter = "Introduce tu contraseña";
		String llave= lector.nextLine();



		while(clave.equals(pass)==false){
			System.out.println(enter+"\n"+llave);
			pass = llave;


			if(clave.equals(llave)==false)
				System.out.println("Contraseña incorrecta :( ");
			break;					
		}		

			System.out.println("Contraseña correcta \n BIENVENIDO !!!");
	}
}