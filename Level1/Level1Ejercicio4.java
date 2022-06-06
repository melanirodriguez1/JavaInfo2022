//Realizar un programa que calcule el factorial de un número:

import java.util.Scanner;

public class Level1Ejercicio4 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial: ");
        int numero = scan.nextInt();

        int factorial = 1;
        scan.close();

        for (int i = numero; i > 0; i--) {
            factorial = factorial *i;
        }
        

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
}
