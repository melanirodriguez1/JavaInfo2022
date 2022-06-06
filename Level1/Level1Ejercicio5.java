import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice 
la operación de multiplicación por sumas sucesivas (sin uso de librerías).
*/

public class Level1Ejercicio5 {
    public static void main (String [] args) {
        Scanner mult = new Scanner(System.in);
        int i, num1, num2, producto;
        producto = 0;
        System.out.print("Ingrese un número: ");
        num1 = mult.nextInt();
        mult.nextLine();
        System.out.print("Ingresa otro número: ");
        num2 = mult.nextInt();
        mult.nextLine();
        mult.close();
        for(i=1; i<=num2; i++) {
            producto = producto + num1;
            System.out.println();
        }
        System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
    }
}
