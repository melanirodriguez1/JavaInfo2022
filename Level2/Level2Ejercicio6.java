/*Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) 
de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni 
y el valor (value) es el sueldo calculado.
 */
import java.util.HashMap;
import java.util.HashSet;

public class Level2Ejercicio6 {
    public static void main(String [] args){
        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleado.add(new Employee("Carlos Perez", 30563286, 8, 350));
        empleado.add(new Employee("Lucas Arias", 17909665, 9, 345));
        empleado.add(new Employee("Andres Villa", 16613059, 10, 300));
        empleado.add(new Employee("Mariana Juarez", 34071113, 6, 550));
        empleado.add(new Employee("Denise Soto", 25242239, 7, 500));

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee tabla : empleado) {
            sueldo.put(tabla.clave(), tabla.valor());
        }
        System.out.println("\nSueldo percibido:\n");
        sueldo.forEach((dni, valorSueldo) -> System.out.println("DNI: " + dni + " - Sueldo: " + valorSueldo));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
        
    }
}
