package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> baraja = new ArrayList<>();
        System.out.println("Baraja ordenada:");
        System.out.println(cargar(baraja));
        System.out.println("Baraja al reves:");
        System.out.println(invertida(baraja));
        System.out.println("Baraja mezclada:");
        Collections.shuffle(baraja); //Funcion que me mezcla aleatoriamente los elementos de una lista
        System.out.println(baraja);
        
    }

    //Funcion que me carga una lista con valores enteros hasta el 13
    public static List<Integer> cargar(List<Integer> cartas) {
        for(int x = 1; x <= 13; x++) {
            cartas.add(x);
        }
        return cartas;
    }

    //Funcion que invierte el orden de los elementos
    public static List<Integer> invertida(List<Integer> lista) {
        List<Integer> reves = new ArrayList<>();
        for(Integer carta : lista) {
            reves.add(0, carta);
        }
        return reves;
    }
}
