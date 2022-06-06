//Confeccionar un programa que dado un número entero como dato
// de entrada imprima la secuencia de números (incrementos 
//de 1)


public class Level1Ejercicio3 {

    public static void main (String[] args) {
        int numero =  8;

        for(int i = 0; i<numero; i++ ) {
            for (int j = 1; j<i+2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            
        } 
    }
    
}
