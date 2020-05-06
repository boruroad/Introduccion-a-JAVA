/**
 * Clase que simula el comportamiento de un robot
 * @author Bonilla Ruiz Roberto Adrián
 * @version 1.0 20/09/2019
 */
public class Robot {
    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;

    /**
     * Constructor de un robot a partir de su nombre, marca y numero de serie
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - numero de serie del robot
     */
    public Robot (String n, String m, String num) {
        this.nombre   = n;
        this.marca    = m;
        this.numSerie = num;
    }
    /**
     * Metodo para asignar nombre al robot
     * @param nomb -- cadena con el nombre del robot
     */
    public void asignarNombre(String nomb) {
        this.nombre = nomb;       

    }
    /**
     * Metodo para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo para asignar numSerie al robot
     * @param num -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String num) {
        this.numSerie = num;
    }
    /**
     * Metodo para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
        return this.nombre;
    }
    /**
     * Metodo para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
        return this.marca;
    }
    /**
     * Metodo para obtener el numero de Serie del robot
     * @return String -  numero de serie del robot
     */
    public String obtenerNumSerie() {
        return this.numSerie;
    }
    /** 
     * Metodo para hacer dormir al robot
     */
    public void dormir() {
        if (estaDormido == false){
            estaDormido = true;
        }
    }
    /** 
     * Metodo para despertar al robot
     */
    public void despertar() {
        if (estaDormido == true){
            estaDormido = false;
        }  

    }
    /**
     * Metodo para saber si el robot esta despierto
     * @return boolean -- Si es true el robot esta despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
        if (estaDormido == false){
            System.out.println("Zzzz Zzzz");
            return true;
        }
        return false;


    }
    /**
     * Metodo para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
        System.out.println(rollo);
    }
    /**
     * Metodo para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot) {
        return this.marca == robot.obtenerMarca() && this.numSerie == robot.obtenerNumSerie();  
        
    }
    /**
     * Metodo para devolver una cadena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    public String toString () {
         return this.nombre;
         
    }  

    /**
     * Metodo para que el robot reste los numeros que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar(long num1, long num2) {
        long resta;
        resta = (num1 - num2); 

        if (estaDormido ==true){
            System.out.println("Zzzz Zzzz");
             }else{
                System.out.println("la resta de: "+num1+" y "+num2+ " es igual: "+ resta);
                 }  

           
    }
    /**
     * Metodo para que el robot sume los numeros que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar(long num1, long num2) {
        long suma;
        suma = (num1 + num2);

        if (estaDormido ==true){
            System.out.println("Zzzz Zzzz");
        }else{System.out.println("la suma de: "+num1+" y "+num2+ " es igual: "+ suma);

        }    
    }

    /**
     * Metodo para que el robot multiplique los numeros que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar(long num1, long num2) {
        long multiplicacion;
        multiplicacion = (num1*num2);

        if (estaDormido ==true){
            System.out.println("Zzzz Zzzz");
        }else{
            System.out.println("la multiplicacion de: "+num1+" y "+num2+ " es igual: "+ multiplicacion);
        }
    }
    /**
     * Metodo para que el robot divida los numeros que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
    public void dividir(long num1, long num2) {
         if (this.estaDormido ==true){
            System.out.println("Zzzz Zzzz");
         }else{
            if(num2==0){
                System.out.println("No puedo dividir entre cero");
                }else{
                    long divide = (num1/num2);
                    System.out.println("la division de: "+num1+" entre "+num2+ " es igual: "+ divide);

                }
        
            }
    }   
}
