import java.util.Scanner;

public class programachido {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        int numero;

        System.out.println("Ingresa un nùmero del 1 AL 4 y te dirè a què personaje animado eres xD.");
        numero = leer.nextInt();
        
       if(numero==1){
       System.out.println("Comes como hablas, eres Fiona");
       }
       
       if(numero==2){
       System.out.println("Repentinamete te da sed de la mala. "+ "Eres homero.");
       }
       if(numero==3){
       System.out.println("Dices mucha mensada, eres burro de Shrek");
       }
              if(numero==4){
       System.out.println("Traicion al linaje familiar, eres Kobu");
       }

	switch(numero){
			case 1:
				//iprimes 1
			break;
			default:
				System.out.println("no seas burro es del 1 al 4 nada mas");
			break;
		}

	}
}


