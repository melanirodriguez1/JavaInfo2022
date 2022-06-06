//Solicitar por consola el nombre del usuario e imprimir por 
//pantalla el siguiente mensaje “HOLA {USUARIO}!!!

import java.util.Scanner;

public class Level1Ejercicio1 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.next();
        scan.close();
    
        System.out.println("Hola " + nombre);


    }
}