//Realizar un programa que solicite por consola 2 números enteros. 
//Para luego imprimir el resultado de la suma, resta, multiplicación, 
//división y módulo (resto de la división) de ambos números.


import java.util.Scanner;

public class Level1Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese otro número menor al anterior: ");
        int numero2 = scan.nextInt();
        scan.close();
    
        System.out.println(numero1 + "+" + numero2 + "=" + (numero1+numero2));
        System.out.println(numero1 + "-" + numero2 + "=" + (numero1-numero2)); 
        System.out.println(numero1 + "*" + numero2 + "=" + (numero1*numero2));
        System.out.println(numero1 + "/" + numero2 + "=" + (numero1/numero2));
        System.out.println(numero1 + "%" + numero2 + "=" + (numero1%numero2));
    }
    
}
