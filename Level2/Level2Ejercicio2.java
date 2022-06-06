/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al ﬁnal. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).*/

import java.util.ArrayList;

public class Level2Ejercicio2 {
    public static void main(String[]args){
        ArrayList<Integer> listaNum = new ArrayList<Integer>();
        for (int i=1; i<6;i++){
            listaNum.add(i);
        }
        System.out.println(listaNum);
        System.out.println("La lista contiene " + listaNum.size() + " elementos.");
        
        System.out.println("Si removemos algunos elementos de la lista: ");

        listaNum.remove(2);
        listaNum.remove(3);

        System.out.println("Ahora la lista es: " + listaNum);
        System.out.println("Y contiene " + listaNum.size() + " elementos.");
    
    }  
}
