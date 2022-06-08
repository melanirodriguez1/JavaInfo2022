import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no ﬁguras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.*/


public class Level2Ejercicio3 {
    public static void main(String[]args) {
            
        ArrayList<Integer> baraja_int = new ArrayList<Integer>();
        for (int i= 1; i<53; i++) baraja_int.add(i);
        System.out.println("Baraja en orden: ");
        System.out.println(baraja_int);
        System.out.println("Baraja en reverso: ");
        Collections.reverse(baraja_int);
        System.out.println(baraja_int);
        Collections.shuffle(baraja_int, new Random());
        System.out.println("Baraja mezclada: ");
        System.out.println(baraja_int);
    
    }
}
