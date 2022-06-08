/*Cargar un arrayList con 12 nombres de estudiantes (String), 
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */


import java.util.ArrayList;
import java.util.List;

public class Level2Ejercicio4 {
    public static void main(String [] args){

        List<String> estudiante = new ArrayList<>();
        estudiante.add("Juan");
        estudiante.add("Marcelo");
        estudiante.add("Belén");
        estudiante.add("Betiana");
        estudiante.add("Jimena");
        estudiante.add("Hugo");
        estudiante.add("Lucas");
        estudiante.add("José");
        estudiante.add("Ignacio");
        estudiante.add("Ramiro");
        estudiante.add("Facundo");
        estudiante.add("Amelia");

        List<String> curso1 = estudiante.subList(0, 4);
        List<String> curso2 = estudiante.subList(4, 8);
        List<String> curso3 = estudiante.subList(8, 12);

        System.out.println("---------------------");
        System.out.println("Curso 1: " + curso1);
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Curso 2: " + curso2);
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Curso 3 : " + curso3);
        System.out.println("---------------------");
        
    }
}