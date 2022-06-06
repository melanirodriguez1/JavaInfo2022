/*Realizar un programa que dado un String de entrada en minúsculas 
lo convierta por completo a mayúsculas. Sin uso de métodos o librerías 
que realicen toUppercase().
*/
import java.util.Scanner;

public class Level1Ejercicio7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúsculas: ");
        String palabra = scan.nextLine();
        scan.close();
        char strArr[] = palabra.toCharArray();
            for (int i = 0; i < strArr.length; i++) {
                    // here is the actual logic
                    if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                            strArr[i] = (char) ((int) strArr[i] - 32);
                    }
            }
            System.out.print("La palabra en mayúsculas es: ");
            // print the string array
            for (int i = 0; i < strArr.length; i++) {
                    System.out.print(strArr[i]);
            }
    }
}

