package Level3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        
        palabras.stream() //convierto a stream la lista 'palabras'
            .filter(n -> n != null) //filtra por valor null
            .filter(n -> !n.isEmpty()) //filtra por vacio
            .forEach(System.out::println);
    }
}
