/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/
import java.util.Scanner;

public class Level1Ejercicio8 {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("¿Cual es su direccion?: ");
        String direccion = scan.nextLine();
        System.out.println("¿Cual es su ciudad?: ");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad  + " - " + direccion + " - " + edad + " - " + nombre );
    }
}

