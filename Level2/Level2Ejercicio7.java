/*Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array 
de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 
colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe 
frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4  */
import java.util.ArrayList;
import java.util.Scanner;

public class Level2Ejercicio7 {
    public static void main(String [] args){
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese otro número, mayor que el anterior: ");
        num2 = scan.nextInt();
        scan.nextLine();
        scan.close();

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sumaTotal.add(i + ". FizzBuzz");
            } else if (i % 3 == 0) {
                sumaTotal.add(i + ". Buzz");
            } else if (i % 2 == 0) {
                sumaTotal.add(i + ". Fizz");
            } else {
                System.out.println(i + ". ");
            }

        }
        for (int j = 0; j < sumaTotal.size(); j++) {
            System.out.println(sumaTotal.get(j));
        }
    }
}
