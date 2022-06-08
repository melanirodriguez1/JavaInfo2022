/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de 
carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego 
imprimir el total final a cobrar. */
import java.util.ArrayList;
import java.util.List;

public class Level2Ejercicio5 {
    public static void main(String [] args){
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            //aquí tomo las horas trabajadas y se lo paso en multiplicacion al valor por hora
            int hs = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(hs);
        }
        int totalesHs = 0;
        for (Integer hs : totales) {
            totalesHs += hs;

        }
        System.out.println(totales);
        System.out.println("Total Final: $" + totalesHs);
    }
}
