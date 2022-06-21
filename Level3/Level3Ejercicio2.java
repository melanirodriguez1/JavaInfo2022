/*Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2. */
import java.util.List;
import java.util.stream.Collectors;

public class Level3Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;
        List<Integer> numerosPotenciados = palabras.stream()
                                            .map(p-> Level3Ejercicio2.calcularPotencia(p, potencia))
                                            .collect(Collectors.toList());
        System.out.println(numerosPotenciados);
    }
    public static Integer calcularPotencia(Integer numero, Integer potencia) {
        if (potencia == 0){
            return 1;
        }else {
            return numero * calcularPotencia(numero, potencia-1);
        }
    }
}
