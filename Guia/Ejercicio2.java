import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(("El primer nro es: " + a));
        System.out.println(("El segundo nro es: " + b));
        System.out.println(("El tercer nro es: " + c));
        scan.close();
    }
    
}
