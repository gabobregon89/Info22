package Level3;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        numeros.stream()
            .map(n -> Math.pow(n, 2))
            .forEach(n -> System.out.println(n.intValue()));
    }
}
