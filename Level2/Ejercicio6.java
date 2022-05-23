package Level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado6> empleados = new HashSet<>();
        Map<Integer, Integer> sueldosEmpleados = new HashMap<>();

        empleados.add(new Empleado6("Gabriel Obregon", 33222000, 45, 650));
        empleados.add(new Empleado6("Pepe Sanchez", 55727000, 30, 450));
        empleados.add(new Empleado6("Javier Saviola", 12999555, 40, 600));
        empleados.add(new Empleado6("Javier Mascherano", 43896020, 45, 550));
        empleados.add(new Empleado6("Nicoas Sanchez", 11000444, 36, 475));

        sueldosEmpleados = soloSueldos(empleados);
        System.out.println(sueldosEmpleados);
    }

    //Funcion que me carga un Map con los datos que recorre de un Set que recibe como parametro
    public static Map<Integer, Integer> soloSueldos(Set<Empleado6> trabajadores) {
        Map<Integer, Integer> nomina = new HashMap<>();
        for ( Empleado6 emp : trabajadores) {
            nomina.put(emp.getDni(), (emp.getHorasTrabajadas() * emp.getValorPorHora()));
        }
        return nomina;
    }
}
