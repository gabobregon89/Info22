package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        List<Integer> valorPorHora = new ArrayList<>();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        List<Integer> totalesCobrar = totales(horasTrabajadas, valorPorHora);
        
        System.out.println(totalesCobrar);
        System.out.println("Total Final: $" + suma(totalesCobrar));
    }

    //Funcion que multiplica las horas por el valor, cuyo indice es el mismo en ambas listas
    //y obtenemos una lista con esos totales
    public static List<Integer> totales(List<Integer> horas, List<Integer> valores) {
        List<Integer> totales = new ArrayList<>();
        for(int x = 0; x < horas.size(); x++) {
            for(int z = 0; z < valores.size(); z++) {
                if (x == z) {
                    totales.add(horas.get(x) * valores.get(z));
                }               
            }
        }
        return totales;
    }

    //Funcion que suma todos los elementos de la lista
    public static int suma(List<Integer> lista) {
        int total = 0;
        for(Integer valor : lista) {
            total += valor;
        }
        return total;
    }
}
