import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice 
la operación de potencia (sin uso de librerías)
*/

public class Level1Ejercicio6 {
    public static void main(String[] args) {
        int base, exponente, resultado;
        resultado = 1;

        try (Scanner potencia = new Scanner(System.in)) {
            System.out.println("Introduzca la base: ");
                base = potencia.nextInt();
                potencia.nextLine();
                System.out.println("Introduzca el exponente: ");
                exponente = potencia.nextInt();
                potencia.nextLine();
        }

        for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + exponente + " es " + resultado);
        }
    }
