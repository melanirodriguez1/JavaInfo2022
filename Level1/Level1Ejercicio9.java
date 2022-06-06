/*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.*/

import java.util.Scanner;


public class Level1Ejercicio9 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto o frase: ");
        String texto = scan.nextLine();
        char caracter = 'a';
        char[] letras = texto.toCharArray();
        int contador = 0;
        scan.close();

        for (char i : letras ){
            if (i == caracter){
                contador++;
            }  
        }
        String salida = String.format("La letra '%s' se repite: %d veces",caracter,contador);
        System.out.println(salida);
    }
}
