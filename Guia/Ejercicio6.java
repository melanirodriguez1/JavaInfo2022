import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int numero;

        while (continuar == 1) {
            System.out.println("Por favor, ingrese un número: ");
            numero = scan.nextInt();
            System.out.println("El número ingresado es: "+ numero);

            System.out.println("Si desea continuar presione 1, sino cualquier otro número");
            continuar = scan.nextInt();
        }
        scan.close();

    }
}
