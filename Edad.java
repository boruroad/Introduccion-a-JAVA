import java.util.Scanner;
/**
 * Programa para calcular la cumple de una persona
 * Objetivo. crear y utilizar objetos de la clase Fecha
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */ 
public class Edad {
    public static void main(String[] pps) {
	Scanner lector = new Scanner(System.in);
	Fecha hoy = new Fecha();
	String nombre;
	int dia, mes, anio,cumpleA, diaA, mesA;

	
	//Declarar las variables

	System.out.print("Dame tu nombre \n");
	nombre = lector.nextLine();

//Recabar informacion
	System.out.println("Ingresa tu fecha de nacimiento \nDia");
	do{ 
		dia = lector.nextInt();
		if(dia>31 || dia<= 0){
			System.out.println("Dia inválido");
		}	
	} while (dia>31 || dia<= 0);

	System.out.println("\nMes");

	do{
		mes = lector.nextInt();
		if(mes>=13 || mes<= 0)
			System.out.println(mes+" Mes incorrecto");
	}while(mes>=13 || mes<= 0);

	System.out.println("\nAño");

	do{
		anio = lector.nextInt();

		if(anio>hoy.obtenerAnio() || anio<1900)
			System.out.println("Año inválido");

	}while(anio>hoy.obtenerAnio() || anio<1900);


		System.out.println("La fecha es correcta !!!");
		cumpleA =(hoy.obtenerAnio()-anio);
		diaA =(hoy.obtenerDia()-(dia));
		mesA =(hoy.obtenerMes()-mes);

		if((dia==hoy.obtenerDia()) & (mes==hoy.obtenerMes())){
				System.out.println("Felicidades !!! \t\n***Hoy es tu cumpleaños***");
				diaA=0;
			}else{
				if(mes<hoy.obtenerMes()){
					cumpleA-=1;

					if(dia>hoy.obtenerDia()){
						//diaA = ((dia)-hoy.obtenerDia()+(mes-hoy.obtenerMes())*30);
						diaA = dia-hoy.obtenerDia();
					}
					if(dia<hoy.obtenerDia() & (mes<=hoy.obtenerMes())){
						System.out.println("Tu cumpleaños ya ha pasado");
						diaA = (365-hoy.diasTranscurridos());
						cumpleA += 1;
						System.out.println("\n" +nombre+ " tienes "+cumpleA+" años.");		
						System.out.println("Faltan "+diaA+" dia(s) para tu cumpleaños");	
					}
				}
				if(mes>hoy.obtenerMes()){
					diaA = (((mes-hoy.obtenerMes())*30)-hoy.obtenerDia()+dia);
					cumpleA -=1; 
					System.out.println("\n" +nombre+ " tienes "+cumpleA+" años.");		
					System.out.println("Faltan "+diaA+" dia(s) para tu cumpleaños");
			
				}if(mes==hoy.obtenerMes()){
					//cumpleA-=1;

					if(dia>hoy.obtenerDia()){
						//diaA = ((dia)-hoy.obtenerDia()+(mes-hoy.obtenerMes())*30);
						diaA = dia-hoy.obtenerDia();
						cumpleA-=1;
						System.out.println("\n" +nombre+ " tienes "+cumpleA+" años.");
						System.out.println("Faltan "+diaA+" dia(s) para tu cumpleaños");
					}
					if(dia<hoy.obtenerDia()){
						System.out.println("Tu cumpleaños ya ha pasado");
						diaA = (365-(dia-hoy.obtenerDia()));
						cumpleA += 1;
						System.out.println("\n" +nombre+ " tienes "+cumpleA+" años.");		
						System.out.println("Faltan "+diaA+" dia(s) para tu cumpleaños");	
					}
				}

			}
		

			//System.out.println("\n" +nombre+ " tienes "+cumpleA+" años.");		
			//System.out.println("Faltan "+diaA+" dia(s) para tu cumpleaños");
		


	
	if(cumpleA<18)
			System.out.println("Eres joven. Felicidades !!!");
		else
			if(cumpleA<=40)
			System.out.println("Eres mayor de edad");		
		else
			if(cumpleA<200)
			System.out.println("Eres adulto mayor. Felicidades !!!");		
		
		

    }
}
